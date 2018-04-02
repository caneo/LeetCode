import java.util.Scanner;

public class mergeTwoSortedArray {
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		int m=in.nextInt();
		int n=in.nextInt();
		int[] b=new int[n];
		int[] a=new int[m+n];
		int i=0;
		int j=0;
		/*if(m==0 || n==0){
			return null;
		}*/
		while(i<m){
			a[i++]=in.nextInt();
		}
		while(j<n){
			b[j++]=in.nextInt();
		}
		new mergeTwoSortedArray().mergeArray(a, b, m, n);
		for(int i1=0; i1<a.length; i1++){
			System.out.print(a[i1]);
		}
	}
	
	public void mergeArray(int[] a, int[] b, int m, int n){
		int i=m-1;
		int j=n-1;
		int k=m+n-1;
		while(i>=0 && j>=0){
			if(a[i]>=b[j]){
				a[k--]=a[i--];
			}
			else if(a[i]<b[j]){
				a[k--]=b[j--];
				}
		}
		return;
		
	}
}
