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
    public boolean isBalanced(TreeNode root) {
        return checkBalanced(root)==-1?false:true;
    }
    /*
        对于每个分支，分成：
        1.左子树或者右子树不平衡，那么直接返回负值－1，后面均不用判断，整个树都为不平衡。
        2.左子树和右子树均为平衡树，但是这种情况下需要做判断：
            求出左子树和右子树的高度
            2.1左子树高度和右子树（在子树均为平衡树的情况下）高度相差大于1，则代表该树不平衡，返回－1
            2.2左子树和右子树高度差小于1，返回子树中更高的高度＋1
    */
    int checkBalanced(TreeNode node){
        if(node == null)return 0;//2.2
        int lefth,righth;
        lefth = checkBalanced(node.left); 
        righth = checkBalanced(node.right);
        if(lefth == -1 || righth == -1)return -1; //1.
        if(lefth-righth > 1 || righth-lefth > 1)return -1; //2.1
        return lefth>righth?lefth+1:righth+1;
    }
}
