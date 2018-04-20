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
    public int widthOfBinaryTree(TreeNode root) {
        if(root==null){
            return 0;
        }
        List<Integer> leftList=new ArrayList<Integer>();
        //leftList.add(root.val);
        return dfs(root, 1, 1, 0, leftList);
    }
    
    public int dfs(TreeNode root, int curPos, int res, int depth, List<Integer> leftList){
        if(root==null){
            return 0;
        }
        if(leftList.size()<= depth){
            leftList.add(curPos);
        }
        res=Math.max(res, curPos+1-leftList.get(depth));
        return Math.max(res, Math.max(dfs(root.left, curPos*2, res, depth+1, leftList), dfs(root.right, curPos*2+1, res, depth+1, leftList)));
    }
    
}