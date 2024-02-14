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
    public ListNode rotateRight(ListNode head, int k) {
       
       if(head==null)
       return head;
        int c=1;
        ListNode node=head;
        while(node.next!=null){
            node=node.next;
                c++;
        }
        
        if(k%c==0)
        return head;
        if(k>c)
        k=k%c;
        
      ListNode  tail=node;
        tail.next=head;
        node=head;
        for(int i=0;i<c-k-1;i++)
        {
            node=node.next;
        }
        head=node.next;
        node.next=null;

        
        return head ;


        
    }
}