/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
 import java.util.*;
 //BFS
public class Solution {
    public int maxDepth(TreeNode root) {
        if(root == null)return 0;
        
        Queue<TreeNode> que = new LinkedList<TreeNode>(); //Queue<TreeNode *> que;
        que.add(root);
        int flag = 1;
        int depth = 0;
        
        while(que.peek() != null){
            //push
            TreeNode temp = que.poll();
            flag --;
            if(temp.left != null)
            que.add(temp.left);
            if(temp.right != null)
            que.add(temp.right);
            
            if(flag == 0){
                depth++;
                flag = que.size();
            }
            
        }
        
        return depth;
    }
}
