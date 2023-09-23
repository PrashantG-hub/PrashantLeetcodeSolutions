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
    int maxlevel=0;
     List<Integer> list=new ArrayList<>();
    public List<Integer> rightSideView(TreeNode root) {

        leftview(root,1);
        return list;
    }

    void leftview(TreeNode root,int level){
      if(root==null)
      return;
      
      if(maxlevel < level)
      {
          list.add(root.val);
          maxlevel=level;
      }
      
      leftview(root.right,level+1);
      leftview(root.left,level+1); 

    }
}