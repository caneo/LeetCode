/*
中序遍历，左子树，根节点，右子树
*/
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
    List<Integer> res=new ArrayList<Integer>();
    public List<Integer> inorderTraversal(TreeNode root) {
        dp(root);
        return res;
    }
    public void dp(TreeNode root){
        if(root==null){
            return; 
        }
        if(root.left!=null){
            dp(root.left);
        }
        res.add(root.val);
        if(root.right!=null){
            dp(root.right);
        }
        
    }
}