package DeleteDuplicates;

import java.util.LinkedList;
import java.util.Queue;

public class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if(head == null) return null;
        ListNode current = head;
        ListNode lastValid = head;
        ListNode valid = new ListNode(-200);
        ListNode result = valid;
        int duplicate = 0;
        while(current.next != null){
            if(current.val == current.next.val){
                duplicate = current.val;
                ListNode prev = current;
                while(current.next != null && current.val == duplicate){
                    current = current.next;
                }
            }
            else{
                valid.val = current.val;
                lastValid = valid;
                valid.next = new ListNode();
                valid = valid.next;
                current = current.next;
            }
        }
        if(duplicate != current.val){
            valid.val = current.val;
        }
        else{
            lastValid.next = null;
        }
        if(result.val == -200) return null;
        return result;
    }
}
