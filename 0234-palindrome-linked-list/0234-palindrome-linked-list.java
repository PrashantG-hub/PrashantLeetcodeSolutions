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
    public boolean isPalindrome(ListNode head) {
        if(head==null || head.next==null)
        return true;
      ListNode fast=head,slow=head;
      while(fast!=null && fast.next!=null){
       fast=fast.next.next;
       slow=slow.next;
      }

    ListNode prev=ReverseList(slow); 
    ListNode cur1=prev,cur2=head;
    while(cur1!=null){
        if(cur1.val!=cur2.val)
        return false;
        cur1=cur1.next;
        cur2=cur2.next;
    }
    return true; 
     
    }
   
   ListNode ReverseList(ListNode slow){
    
    ListNode prev=null,curr=slow;
    while(curr!=null){
      ListNode temp=curr.next;
       curr.next=prev;
       prev=curr;
       curr=temp;
    }
    return prev;
   }

}

// Space O(N) && Time O(N)-------------------------------------------------------------------------

        // Deque<Integer> deque = new ArrayDeque<>();
        // ListNode curr=head;
        // while(curr!=null){
        //     deque.add(curr.val);
        //     curr=curr.next;
        // }
        
        // while(deque.size()!=0){
        //     if(deque.size()==1)
        //     return true;
        //     if(deque.pollFirst()!=deque.pollLast())
        //     return false;
        // }
        // return true;
