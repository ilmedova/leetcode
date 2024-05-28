package ReverseLinkedListII;

import java.util.Stack;

public class Solution {
    public ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode current = head;
        Stack<Integer> s = new Stack<>();
        int counter = 1;
        while(current != null){
            if(counter >= left && counter <= right){
                s.push(current.val);
            }
            current = current.next;
            counter++;
        }
        counter = 1;
        current = head;
        while(current != null){
            if(counter >= left && counter <= right){
                current.val = s.pop();
            }
            current = current.next;
            counter++;
        }
        return head;
    }
}
