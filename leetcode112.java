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
        boolean flag=false;
	    public boolean hasPathSum(TreeNode root, int sum) {
            if(root==null){
                return flag;
            }
            dfs(root, root.val, sum);
            return flag;
        }
        public void dfs(TreeNode tempNode, int tempSum, int sum){
            if((tempNode.left==null) && (tempNode.right==null) && tempSum==sum){
                flag=true;
                return;
            }
            if((tempNode.left==null) && (tempNode.right==null) && tempSum!=sum){
                 return;
            }
            
            if(tempNode.left!=null){
                dfs(tempNode.left, tempSum+tempNode.left.val, sum);
            }
            if(tempNode.right!=null){
                dfs(tempNode.right, tempSum+tempNode.right.val, sum);
            }
        }
}
