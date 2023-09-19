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

// Time Complexity O(2N)~O(N)  -------Space complexity-O(1)----------------------------------------
ListNode Start=new ListNode();
Start.next=head;
ListNode fast=Start;
for(int i=1;i<=n;i++){
    fast=fast.next; 
}
ListNode slow=Start;
while(fast.next!=null){
    fast=fast.next;
    slow=slow.next;
}
slow.next=slow.next.next;
return Start.next;

// Time Complexity O(2N)~O(N)  -------Space complexity-O(1)----------------------------------------
        // int size=1;
        // ListNode l1=head;
        // while(l1.next!=null){
        //     l1=l1.next;
        //     size++;
        // }

        //   if(size==n){
        //     head=head.next;
        //     return head;
        // }
        // ListNode l2=head;
        // for(int i=1;i<size-n;i++){
        //     l2=l2.next;
        // }
        // l2.next=l2.next.next;
        // return head;
    }
}