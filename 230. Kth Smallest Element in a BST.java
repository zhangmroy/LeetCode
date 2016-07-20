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
    
    public int kthSmallest(TreeNode root,int n){
        int count = GetLeftCount(root.left);
        
        // if(count == n-1)return root.val;
        // else if(count < n-1)return kthSmallest(root.right,n-1-count);
        // else return kthSmallest(root.left,n-1);
        if(count < n-1)return kthSmallest(root.right,n-1-count);
        else if(count > n-1)return kthSmallest(root.left,n);
        return root.val;
    }
    
    public int GetLeftCount(TreeNode left){
        if(left == null)return 0;
        else return GetLeftCount(left.left)+GetLeftCount(left.right)+1;
    }
    

    
}
