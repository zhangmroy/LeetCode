/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
 /递归思想/
public class Solution{
    public boolean isSymmetric(TreeNode root){
        return isMirror(root,root);
    }
    public boolean isMirror(TreeNode r1,TreeNode r2){
        return r1==null || r2==null?r1==r2:r1.val==r2.val &&isMirror(r1.left,r2.right)&&isMirror(r1.right,r2.left);
    }
}
 /*
 超时错误。
 非递归：层次遍历，对于相同层的数据，用stack和queue来比较是否符合镜像要求
public class Solution {
    public boolean isSymmetric(TreeNode root) {
        if(root == null)return true;
        TreeNode nulltree = new TreeNode(-1);
        Stack<TreeNode> stack = new Stack<TreeNode>();
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        Queue<TreeNode> q = new LinkedList<TreeNode>();
        boolean flag_end = true;
        q.offer(root);
        while(!q.isEmpty() && flag_end){
            queue.clear();
            stack.clear();
            flag_end = false;
            while(!q.isEmpty()){
                TreeNode temp = q.poll();
                if(temp.left != null){queue.offer(temp.left);stack.push(temp.left);flag_end = true;}
                else {queue.offer(nulltree);stack.push(nulltree);}
                if(temp.right != null){queue.offer(temp.right);stack.push(temp.right);flag_end = true;}
                else {queue.offer(nulltree);stack.push(nulltree);}
            }

            //judge
            while(!queue.isEmpty() && !stack.isEmpty()){
                TreeNode tq = queue.poll();
                TreeNode ts = stack.pop();
                if(tq.val != ts.val)return false;
                if(tq == nulltree && ts != nulltree)return false;
                if(tq != nulltree && ts == nulltree)return false;
                q.offer(tq);
                
            }
            
        }
        return true;
    }
} */
