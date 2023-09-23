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
    int value=0,max=0;
    public int findBottomLeftValue(TreeNode root) {
       findbottom(root,1);
       return value; 
    }
    void findbottom(TreeNode root,int level){
     if(root==null)
     return;
    
    if(max<level){
    value=root.val;
    max=level;
    }

    findbottom(root.left,level+1);
    findbottom(root.right,level+1);

    }
}