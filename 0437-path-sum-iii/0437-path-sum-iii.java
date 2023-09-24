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
      
      HashMap<Long, Integer> hm=new HashMap<>();
      hm.put((long)0,1);

        findallsum(root,targetSum,0,hm);

        return allcomb;
    }

   void findallsum(TreeNode root, int targetSum,long sum,HashMap<Long, Integer> hm){
     
     if(root==null)
     return;

     sum+=root.val;
    if(hm.containsKey(sum-targetSum))
    allcomb+=hm.get(sum-targetSum);

    hm.put(sum,hm.getOrDefault(sum,0)+1);

     findallsum(root.left,targetSum,sum,hm);
     findallsum(root.right,targetSum,sum,hm);
     hm.put(sum,hm.get(sum)-1);
    
   }


    //--------- TC O(N), SC O(1)-Fixing one Node and travesing along the tree-------------------------------------------


//     public int pathSum(TreeNode root, int targetSum) {
//         if(root==null)
//         return allcomb;

//         findallsum(root,targetSum,0);

//          pathSum(root.left,targetSum);
//          pathSum(root.right,targetSum);

//         return allcomb;
//     }
   
//    void findallsum(TreeNode root, int targetSum,long sum){
     
//      if(root==null)
//      return;

//      sum+=root.val;
    
//      if(sum==targetSum)
//      allcomb++;

//      findallsum(root.left,targetSum,sum);
//      findallsum(root.right,targetSum,sum);
     

//    }

}