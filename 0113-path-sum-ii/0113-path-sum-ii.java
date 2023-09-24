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
    List<List<Integer>> finallist=new ArrayList<>();
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<Integer> list=new ArrayList<>();
        findsumcombinations(root,targetSum,list);
        return finallist;
    }

   void findsumcombinations(TreeNode root, int targetSum,List<Integer> list){
       
       if(root==null)
       return;

       list.add(root.val);

      if(root.left == null && root.right == null && root.val==targetSum){
        finallist.add(new ArrayList<>(list));
      }

    findsumcombinations(root.left,targetSum-root.val,list);
    findsumcombinations(root.right,targetSum-root.val,list); 
    list.remove(list.size()-1);
    }
}