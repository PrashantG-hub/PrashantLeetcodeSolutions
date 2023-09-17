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
    public List<Integer> getAllElements(TreeNode root1, TreeNode root2) {
        getInorder(root1);
        getInorder(root2);
        return list;
    }

    void getInorder(TreeNode root){
        if(root==null)
        return;
     
     getInorder(root.left);
     list.add(root.val);
     getInorder(root.right);
     
    Collections.sort(list); 
    //  int end=list.size()-1;
    //  Divide(0,end);

    }
    
//     // Dividing th array
//     public void Divide(int top,int bottom) {
//       int mid=top+(bottom-top)/2;
//         if(top>=bottom)
//         return;

//         Divide(top,mid);
//         Divide(mid+1,bottom);

//         Conquer(top,mid,bottom);
//     }

// // adding elments to array in sorted order
// public void Conquer(int top,int mid, int bottom){
//  int[] merge=new int[bottom-top+1];
//  int idx1=top,idx2=mid+1,x=0;

//  while(idx1<=mid && idx2<=bottom){
//      if(nums[idx1]<=nums[idx2])
//      merge[x++]=nums[idx1++];
//      else
//      merge[x++]=nums[idx2++];
//  }

//  while(idx1<=mid ){
//  merge[x++]=nums[idx1++];
//  }

//  while(idx2<=bottom){
//    merge[x++]=nums[idx2++];  
//  }

//  for(int i=0,j=top;i<merge.length;i++,top++){
//      nums[top]=merge[i];
//  }
// }

}