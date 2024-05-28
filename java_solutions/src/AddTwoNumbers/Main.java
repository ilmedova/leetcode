package AddTwoNumbers;

import AddTwoNumbers.ListNode;
import AddTwoNumbers.Solution;

import java.text.ParseException;

public class Main {
    public static void main(String[] args) throws ParseException {
        int[] arrayA = {9,9,9,9,9,9,9};
        int[] arrayB = {9,9,9,9};
        ListNode h1 = new ListNode();
        ListNode h2 = new ListNode();
        ListNode l1 = h1;
        ListNode l2 = h2;
        for(int i = 0; i < arrayA.length; i++){
            l1.val = arrayA[i];
            if(i < arrayA.length-1){
                l1.next = new ListNode();
                l1 = l1.next;
            }
        }
        for(int i = 0; i < arrayB.length; i++){
            l2.val = arrayB[i];
            if(i < arrayB.length-1){
                l2.next = new ListNode();
                l2 = l2.next;
            }
        }
        Solution s = new Solution();
        ListNode listNode = s.addTwoNumbers(h1, h2);
        while(listNode != null){
            System.out.print(listNode.val);
            listNode = listNode.next;
        }
    }
}