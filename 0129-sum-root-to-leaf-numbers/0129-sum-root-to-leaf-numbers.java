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
    int finalsum=0;
    public int sumNumbers(TreeNode root) {
        int sum=0;
        if(root==null)
        return finalsum;

        findSumRootLeaf(root,sum);
        return finalsum;
    }

    void findSumRootLeaf(TreeNode root,int sum){
         if(root==null)
        return;
         sum=sum*10+root.val;
        if(root.left==null && root.right==null){
         finalsum+=sum;
         return;
        }
     
     findSumRootLeaf(root.left,sum);
     findSumRootLeaf(root.right,sum);

    }
}