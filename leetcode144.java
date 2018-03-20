/*
先序遍历，根节点，左子树，右子树
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
    public List<Integer> res=new ArrayList<Integer>();
    public List<Integer> preorderTraversal(TreeNode root) {
        pre(root);
        return res;
    }
    public void pre(TreeNode root){
        if(root==null){
            return;
        }
        res.add(root.val);
        pre(root.left);
        pre(root.right);
    }
}