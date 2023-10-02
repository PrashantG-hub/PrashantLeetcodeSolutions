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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if(head == null) return head;
        if(left > right) return head;
        while(left<right){
            ListNode leftNode = getNode(head, left);
            ListNode rightNode = getNode(head, right);
            int temp = leftNode.val;
            leftNode.val = rightNode.val;
            rightNode.val = temp;
            left++;
            right--;
        }
        return head;
    }
    public ListNode getNode(ListNode head, int index){
        ListNode temp = head;
        for(int i=1; i< index; i++){
            temp = temp.next;
        }
        return temp;
    }
}