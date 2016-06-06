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
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        if(root == null)return new LinkedList<List<Integer>>();
        Stack<List<Integer>> stack = new Stack<List<Integer>>();
        List<List<Integer>> result = new LinkedList<List<Integer>>();
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.offer(root);
        while(!queue.isEmpty()){
            List<Integer> list = new ArrayList<Integer>();
            for(Iterator it = queue.iterator();it.hasNext();){
                TreeNode tn=(TreeNode)it.next();
                if(tn != null)
                list.add(tn.val);
            }
            stack.push(list);
            
            Queue queue_temp = new LinkedList<TreeNode>();
            while(!queue.isEmpty()){
                TreeNode t = queue.poll();
                if(t == null)continue;
                if(t.left != null)queue_temp.offer(t.left);
                if(t.right != null)queue_temp.offer(t.right);
            }
            queue = queue_temp;
        }
        while(!stack.isEmpty()){
            result.add(stack.pop());
        }
        return result;
    }
}
/**
  1.层次遍历，用到queue
  2.每一层用list存值压入栈中
  3.把栈中的值转换成为list 返回
*/
