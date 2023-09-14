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
    
    List<Integer> list1=InOrderTraversal(root);
    return createBST(list1,0,list1.size()-1);

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

    List<Integer> InOrderTraversal(TreeNode root){
      
      List<Integer> list=new ArrayList<>();
      if(root==null)
      return list;

      list.addAll(InOrderTraversal(root.left));
      list.add(root.val);
      list.addAll(InOrderTraversal(root.right));

       return list;
    }
}