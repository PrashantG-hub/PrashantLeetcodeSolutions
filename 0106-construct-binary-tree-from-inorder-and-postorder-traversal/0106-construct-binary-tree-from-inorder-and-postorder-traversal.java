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
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        if(inorder==null || postorder==null || inorder.length!=postorder.length)
        return null;

        HashMap<Integer,Integer> hm=new HashMap<>();

        for(int i=0;i<inorder.length;i++){
            hm.put(inorder[i],i);
        }

        return buildtree(inorder,0,inorder.length-1,postorder,0,postorder.length-1,hm);
    }

   TreeNode buildtree(int[] inorder,int InStart,int InEnd,int[] postorder,int PoStart,int PoEnd,HashMap<Integer,Integer> hm) {
       if(InStart>InEnd || PoStart>PoEnd)
       return null;

       TreeNode root=new TreeNode(postorder[PoEnd]);

       int Inroot=hm.get(postorder[PoEnd]);
       int numsleft=Inroot-InStart;

       root.left=buildtree(inorder,InStart,Inroot-1,postorder,PoStart,PoStart+numsleft-1,hm);
       //                  inorder , 0   ,  0     , postorder ,  0    ,  0    +   1   -1, hm

       root.right=buildtree(inorder,Inroot+1,InEnd,postorder,PoStart+numsleft,PoEnd-1,hm);
       //                  inorder    ,  2  ,  4 , postorder , 0    +    1   ,   0  ,   hm

       return root;
   }

}