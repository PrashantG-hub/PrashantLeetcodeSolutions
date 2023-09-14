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
    public TreeNode balanceBST(TreeNode root) {
        if(root==null)
        return null;
    List<Integer> list=new ArrayList<>();
    InOrderTraversal(root,list);
    return createBST(list,0,list.size()-1);

    }
  public TreeNode createBST(List<Integer> in,int low,int high)
    {
        if(low>high)
        return null;
        int mid=(low+high)/2;
        TreeNode root = new TreeNode(in.get(mid));
        root.left=createBST(in,low,mid-1);
        root.right=createBST(in,mid+1,high);
        return root;
    }

    void InOrderTraversal(TreeNode root,List<Integer> list){
      
      if(root==null)
      return;

      InOrderTraversal(root.left,list);
      list.add(root.val);
      InOrderTraversal(root.right,list);

    }
}