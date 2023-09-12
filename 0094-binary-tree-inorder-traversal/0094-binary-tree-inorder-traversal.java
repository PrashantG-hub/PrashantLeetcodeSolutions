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
    List<Integer> list=new ArrayList<>(); 
    public List<Integer> inorderTraversal(TreeNode root) {
        Solve(root);
        return list;
    }
    void Solve(TreeNode root){
        if(root==null){
             return;
        }
        Solve(root.left);
        list.add(root.val);
        Solve(root.right);
       
    }

}