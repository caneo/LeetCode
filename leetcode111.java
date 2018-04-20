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
    public int minDepth=Integer.MAX_VALUE;
    public int minDepth(TreeNode root) {
        if(root==null){
            return 0;
        }
        dfs(root,1);
        return minDepth;
    }
    public void dfs(TreeNode currentNode,int currentDepth){
        if(currentNode.left==null&&currentNode.right==null){
            if(currentDepth<minDepth){
                minDepth=currentDepth;
                return;
            }
        }
        if(currentDepth>minDepth){
            return;
        }
        if(currentNode.left!=null){
            dfs(currentNode.left,currentDepth+1);
        }
        if(currentNode.right!=null){
            dfs(currentNode.right,currentDepth+1);
        }
        
    }
}