package DeleteDuplicates;

public class Main {
    public static void main(String[] args){
        Solution s = new Solution();

        ListNode n = new ListNode(1);
        ListNode head = n;
        n.next = new ListNode(1);
        n = n.next;
        n.next = new ListNode(1);
//        n = n.next;
//        n.next = new ListNode(2);
//        n = n.next;
//        n.next = new ListNode(3);
//        n = n .next;
//        n.next = new ListNode(3);
//        n = n.next;
//        n.next = new ListNode(4);
//        n = n .next;
//        n.next = new ListNode(4);
//        n = n .next;
//        n.next = new ListNode(4);
//        n = n .next;
//        n.next = new ListNode(5);
//        n = n .next;
//        n.next = new ListNode(5);

        ListNode current = s.deleteDuplicates(head);
        while(current != null){
            System.out.println(current.val);
            current = current.next;
        }
    }
}
