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
    public int res=Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root) {
        if(root==null){
            return 0;
        }  
        dfs(root);
        return res;
    }
    
    public int dfs(TreeNode root){
        if(root==null){
            return 0;
        }
        int left=Math.max(dfs(root.left),0);
        int right=Math.max(dfs(root.right),0);
        res=Math.max(res, left+right+root.val);
        return Math.max(left,right)+root.val;
    }
    
}