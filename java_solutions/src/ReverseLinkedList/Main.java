package ReverseLinkedList;

public class Main {
    public static void main(String[] args){
        Solution s = new Solution();
        ListNode head = new ListNode(1);
        ListNode current = head;
        current.next = new ListNode(2);
        current = current.next;
        current.next = new ListNode(-2);
        ListNode h = s.reverseList(head);
        while(h != null){
            System.out.println(h.val);
            h = h.next;
        }
    }
}
