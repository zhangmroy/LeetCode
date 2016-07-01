/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        if(root == null)return new LinkedList<List<Integer>>();
        List<List<Integer>> res = new LinkedList<List<Integer>>();
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        Queue<TreeNode> temp = new LinkedList<TreeNode>();
        queue.offer(root);
        while(!queue.isEmpty()){
            List<Integer> level = new LinkedList<Integer>();
            temp.clear();
            //获取数值
            while(!queue.isEmpty()){
                TreeNode node = queue.poll();
                level.add(node.val);
                
                //导入下层数据
                if(node.left != null)temp.offer(node.left);
                if(node.right != null)temp.offer(node.right);
            }
            //把该层数据装入res
            res.add(level);
            while(!temp.isEmpty())
                queue.offer(temp.poll());
        }
        return res;
    }
}
