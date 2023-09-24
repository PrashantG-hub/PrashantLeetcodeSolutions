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
    int max=-100000,rootlevel=0,s=0,level=0;
    public int maxLevelSum(TreeNode root) {
     Queue<TreeNode> queue = new LinkedList<>();

        if(root==null)
        return max;
        queue.offer(root);
        // node.add(null);

        while(!queue.isEmpty()){
            int size=queue.size();
            level++;

            for(int i=0;i<size;i++){

            if(queue.peek().left!=null)
            queue.add(queue.peek().left);

            if(queue.peek().right!=null)
            queue.add(queue.peek().right);
            
            s=s+queue.peek().val;
            queue.poll();
            }
             if(max<s)
            {
            max=s;
            rootlevel=level;
            }
          s=0;
        }
        return rootlevel;

   
    }

}