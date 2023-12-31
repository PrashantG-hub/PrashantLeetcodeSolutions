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
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list=new ArrayList<>(); 
        Solve(root,list);
        return list;
        
    }
    void Solve(TreeNode root,List<Integer> list){
        if(root==null){
             return;
        }
        Solve(root.left,list);
        list.add(root.val);
        Solve(root.right,list);
       
    }

}