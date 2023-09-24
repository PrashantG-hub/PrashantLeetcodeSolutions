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
    int allcomb=0;
    public int pathSum(TreeNode root, int targetSum) {
        if(root==null)
        return allcomb;

        findallsum(root,targetSum,0);

         pathSum(root.left,targetSum);
         pathSum(root.right,targetSum);

        return allcomb;
    }
   
   void findallsum(TreeNode root, int targetSum,long sum){
     
     if(root==null)
     return;

     sum+=root.val;
    
     if(sum==targetSum)
     allcomb++;

     findallsum(root.left,targetSum,sum);
     findallsum(root.right,targetSum,sum);
     

   }

}