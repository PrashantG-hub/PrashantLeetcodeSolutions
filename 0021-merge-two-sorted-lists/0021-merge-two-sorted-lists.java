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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {

       ListNode result = new ListNode(0);
       ListNode temp=result;
        ListNode t1=list1,t2=list2;
      while(t1!=null && t2!=null){
       if(t1.val<=t2.val){
        temp.next=new ListNode(t1.val);
        temp=temp.next;
        t1=t1.next;
      }
      else{
       temp.next=new ListNode(t2.val);
        temp=temp.next;
        t2=t2.next;
      }
      }
      if(t1 != null) {
            temp.next = t1;
        } else {
            temp.next = t2;
        }
      return result.next;
     }

}