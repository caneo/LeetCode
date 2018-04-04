class Solution {
    //List<TreeNode> res=new ArrayList<TreeNode>();
    public List<TreeNode> generateTrees(int n) {
        if(n==0){
            return new ArrayList<TreeNode>();
        }
        return dp(1,n);
    }
    
     public List<TreeNode> dp(int start, int end){
	       List<TreeNode> res=new ArrayList<TreeNode>();

	       if(start > end){
	           res.add(null);
	           return res;
	       }
	        
           if(start==end){
               res.add(new TreeNode(start));
               return res;
           }
	       for(int i=start; i<=end; i++){
	           List<TreeNode> leftList=dp(start, i-1);
	           List<TreeNode> rightList=dp(i+1,end);
               
	           for(int j=0; j<leftList.size(); j++){
	               for(int k=0; k<rightList.size(); k++){
	                   TreeNode temp=new TreeNode(i);
	                   temp.left=leftList.get(j);
	                   temp.right=rightList.get(k);
	                   res.add(temp);
	               }
	           }
	       }
	        return res;
	}
}