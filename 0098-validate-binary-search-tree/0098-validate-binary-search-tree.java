/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    long low=Long.MIN_VALUE,high=Long.MAX_VALUE;
    public boolean isValidBST(TreeNode root) {
         return  isValid(root,low,high);
    }

    boolean isValid(TreeNode root,long low,long high){
        if(root==null)
        return true;
            
        if(root.val<=low || root.val>=high)
        return false;

    return (isValid(root.left,low,root.val) && isValid(root.right,root.val,high));
           
    }
}
