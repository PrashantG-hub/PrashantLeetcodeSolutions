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
 import java.util.*;
class Solution {
    HashMap<Integer,Integer> hm=new HashMap<>();
    public boolean findTarget(TreeNode root, int k) {
        
        InoderTraversal(root);
        if(hm.size()<=1)
        return false;
        for(int x:hm.keySet()){
            hm.put(x,0);
            if(hm.containsKey(k-x) && hm.get(k-x)!=0)
            return true;
        }
        return false;
    }
    void InoderTraversal(TreeNode root){
        if(root==null)
        return;

         InoderTraversal(root.left);
         hm.put(root.val,1);
         InoderTraversal(root.right);
    }

}