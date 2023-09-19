/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int size=1;
        ListNode l1=head;
        while(l1.next!=null){
            l1=l1.next;
            size++;
        }

          if(size==n){
            head=head.next;
            return head;
        }
        ListNode l2=head;
        for(int i=1;i<size-n;i++){
            l2=l2.next;
        }
        l2.next=l2.next.next;
        return head;
    }
}