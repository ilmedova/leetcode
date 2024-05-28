package AddTwoNumbers;


public class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head = new ListNode();
        ListNode current = head;
        int temp = 0;
        while(l1 != null || l2 != null){
            temp = (l1 != null ? l1.val : 0) + (l2 != null ? l2.val : 0) + temp;
            if(temp > 9){
                current.val = temp % 10;
                temp = (temp - current.val)/10;
            }
            else{
                current.val = temp;
                temp = 0;
            }
            if(l1 != null){
                l1 = l1.next;
            }
            if(l2 != null){
                l2 = l2.next;
            }
            if(l1 != null || l2 != null){
                current.next = new ListNode();
                current = current.next;
            }
            else {
                if (temp != 0) {
                    current.next = new ListNode();
                    current = current.next;
                    current.val = temp;
                }
            }
        }
        return head;
    }
}