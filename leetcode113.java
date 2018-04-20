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
     List<List<Integer>> result = new LinkedList<List<Integer>>();
    public List<List<Integer>> pathSum(TreeNode root, int sum) {   
        if(root==null){
            return result;
        }
        List<Integer> tempList=new ArrayList<Integer>();
        tempList.add(root.val);
        dfs(root, root.val, sum, tempList);
        return result;
    }
    
    public void dfs(TreeNode tempNode, int tempSum, int sum, List<Integer> tempList){
        if((tempNode.left==null) && (tempNode.right==null) && (tempSum ==sum)){
            result.add(new ArrayList(tempList));
            return;
        }
        if((tempNode.left==null) && (tempNode.right==null) && (tempSum !=sum)){
            return;
        }
        if(tempNode.left!=null){
            tempList.add(tempNode.left.val);
            dfs(tempNode.left, tempSum+tempNode.left.val, sum, tempList);
            tempList.remove(tempList.size()-1);
        }
        if(tempNode.right!=null){
            tempList.add(tempNode.right.val);
            dfs(tempNode.right, tempSum+tempNode.right.val, sum, tempList);
            tempList.remove(tempList.size()-1);
        }
    }
}