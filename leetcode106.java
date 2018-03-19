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
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        return dfs(postorder.length-1, 0, inorder.length-1, inorder, postorder);
    }
    public TreeNode dfs(int postEnd, int inStart, int inEnd, int[] inorder, int[] postorder){
        if(postEnd<0 || inStart > inEnd){
            return null;
        }
        TreeNode root= new TreeNode(postorder[postEnd]);
        int rootIndex=-1;
        for(int i= inStart; i<= inEnd; i++){
            if(inorder[i]==root.val){
                rootIndex=i;
                break;
            }
        }
        root.left=dfs(postEnd-(inEnd-rootIndex+1), inStart, rootIndex-1, inorder, postorder);
        root.right=dfs(postEnd-1, rootIndex+1, inEnd, inorder, postorder);
        return root;
    }
}