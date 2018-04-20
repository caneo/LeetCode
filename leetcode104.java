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
    public int maxDepth(TreeNode root) { 
        if(root==null){
            return 0;
        }
        dfs(root, 1);
        return res;
    }
    
    public void dfs(TreeNode tempNode, int tempDep){
        if(tempNode.left==null && tempNode.right==null){
            if(tempDep > res){
                res=tempDep;
            }
            return;
        }
        if(tempNode.left!=null){
          dfs(tempNode.left, tempDep+1);    
        }
        if(tempNode.right!=null){
            dfs(tempNode.right, tempDep+1);
        }
       
    }
}