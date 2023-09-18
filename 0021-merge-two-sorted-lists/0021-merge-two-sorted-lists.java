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
// --------------WITH SPACE COMPLEXITY AS O(1)--------------------------------------
if(list1==null)
return list2;

if(list2==null)
return list1;
 
 if(list1.val>list2.val){
     ListNode temp1=list1;
     list1=list2;
     list2=temp1;
 }
 ListNode res=list1;
while(list1!=null && list2!=null){
    ListNode temp=null;
    while(list1!=null && list1.val<=list2.val){
       temp=list1;
       list1=list1.next;
    }
    temp.next=list2;

    ListNode temp1=list1;
     list1=list2;
     list2=temp1;
}
return res;
// --------------WITH SPACE COMPLEXITY AS O(M+N)-------------------------------------


    //    ListNode result = new ListNode(0);
    //    ListNode temp=result;
    //     ListNode t1=list1,t2=list2;
    //   while(t1!=null && t2!=null){
    //    if(t1.val<=t2.val){
    //     temp.next=new ListNode(t1.val);
    //     temp=temp.next;
    //     t1=t1.next;
    //   }
    //   else{
    //    temp.next=new ListNode(t2.val);
    //     temp=temp.next;
    //     t2=t2.next;
    //   }
    //   }
    //   if(t1 != null) {
    //         temp.next = t1;
    //     } else {
    //         temp.next = t2;
    //     }
    //   return result.next;
     }

}