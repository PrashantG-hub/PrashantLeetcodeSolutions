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
    public List<List<Integer>> levelOrder(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        List<List<Integer>> finallist=new LinkedList<>();
        if(root==null)
        return finallist;
        queue.offer(root);
        // node.add(null);

        while(!queue.isEmpty()){
            int size=queue.size();
            List<Integer> list=new ArrayList<>();
            for(int i=0;i<size;i++){
            
            list.add(queue.peek().val);

            if(queue.peek().left!=null)
            queue.add(queue.peek().left);

            if(queue.peek().right!=null)
            queue.add(queue.peek().right);
            
            queue.poll();
            }
         finallist.add(list);
        }
        return finallist;

    }
}