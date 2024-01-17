package ReverseLinkedList;

import java.util.Stack;

public class Solution {
    public ListNode reverseList(ListNode head) {
        if(head == null) return head;
        Stack<Integer> s = new Stack<>();
        while(head != null){
            s.add(head.val);
            head = head.next;
        }
        head = new ListNode();
        ListNode current = head;
        while(!s.empty()){
            current.val = s.pop();
            if(s.size() > 0){
                current.next = new ListNode();
                current = current.next;
            }
        }
        return head;
    }


}
