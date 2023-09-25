/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public List<Integer> distanceK(TreeNode root, TreeNode target, int k) {
        List<Integer> list = new ArrayList<>();
        HashMap<TreeNode,TreeNode> hm=new HashMap<>();
        findParent(hm,root);
        Queue<TreeNode> queue=new LinkedList<>();
        HashSet<TreeNode> visited=new HashSet<>();

        queue.add(target);

        while(!queue.isEmpty()){
            int size=queue.size();

            for(int i=0;i<size;i++){
                TreeNode curr=queue.poll();
                visited.add(curr);

                if(k==0)
                list.add(curr.val);

                if(curr.left!=null && !visited.contains(curr.left))
                queue.add(curr.left);

                if(curr.right!=null && !visited.contains(curr.right))
                queue.add(curr.right);

                if(hm.containsKey(curr) && !visited.contains(hm.get(curr)))
                queue.add(hm.get(curr));
            }
            k--;
         if(k<0)
         break;   
        }
        return list;
    }
void findParent(HashMap<TreeNode,TreeNode> hm,TreeNode root){
  if(root==null)
  return;

  if(root.right!=null)
  hm.put(root.right,root);

   if(root.left!=null)
  hm.put(root.left,root);
  
  findParent(hm,root.left);
  findParent(hm,root.right);

  return;

 }

}