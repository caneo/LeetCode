
public class MainClass {
	public static void main(String[] args){
		//int[][] test={{1,2,6,9},{2,4,9,12},{4,6,10,13},{5,7,11,15}};
		int[][] test={{7}};
		System.out.println(new MainClass().search(test, 1, 1, 7));
		
	}

	private boolean search(int[][] a, int m, int n, int target) {
		// TODO Auto-generated method stub
		if(a!=null && m>0 && n>0){
			int i=0;
			int j=n-1;			
		while(i<m && j>=0){
			if(a[i][j]>target){
				j--;
				continue;
			}
			if(a[i][j] < target){
				i++;
				continue;
			}
			if(a[i][j] == target){
				return true;
			}
		}
		//return false;
		}
		return false;
	}
}
