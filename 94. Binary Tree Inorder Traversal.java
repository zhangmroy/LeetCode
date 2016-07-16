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
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> res = new LinkedList<Integer>();
        if (root == null)return res;
        else return LeftFirstSearch(res,root);
    }
    public List<Integer> LeftFirstSearch(List<Integer> list,TreeNode treeNode){
        if (treeNode == null)return list;
        else{
            LeftFirstSearch(list,treeNode.left);
            list.add((Integer) treeNode.val);
            LeftFirstSearch(list,treeNode.right);
        }
        return list;
    }
}

/*
  1.递归解法 
*/
