import java.util.List;
import java.util.ArrayList;
public class preandinorder {

	/*public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}*/
	
	public TreeNode buildTree(int[] preTree, int[] inTree){
		return solution(preTree, inTree, 0, 0, inTree.length-1);
	}
	
	public TreeNode solution(int[] preTree, int[] inTree, int preStart, int inStart, int inEnd){
		//List<Integer> list=new ArrayList<Integer>();
		//TreeNode root=new TreeNode(0);
		if(preStart > preTree.length-1 || inStart > inEnd){
			return null;
		}
		int rootindex=preStart;
		TreeNode root=new TreeNode(preTree[preStart]);
		for(int i=inStart; i<inEnd; i++){
			if(inTree[i]==preTree[preStart]){
				rootindex=i;
				//break;
			}
		} 
		root.left=solution(preTree, inTree, preStart+1, inStart, inEnd-1);
		root.right=solution(preTree, inTree, preStart+rootindex-inStart+1, rootindex+1, inEnd);
		return root;
	}

}
