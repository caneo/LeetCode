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
    public int pathSum(TreeNode root, int sum) {
        if(root==null){
            return 0;
        }
        else{
            return helper(root, sum)+pathSum(root.left, sum)+pathSum(root.right, sum);
        }  
    }
    public int helper(TreeNode root, int sum){
        if(root==null){
            return 0;
        }
        if(root.val==sum){
            return 1+helper(root.left, sum-root.val)+helper(root.right, sum-root.val); 
        }
        else{
            return 0+helper(root.left, sum-root.val)+helper(root.right, sum-root.val); 
        }
    }
}