package com.tjy;

public class MainClass {
	public static void main(String[] args){
		int[] a={1, 2, 1, -1};
		int[] b={1,2,-3,-1,1,2};
		int m=2;
		int n=2;
		int k=3;
		int[] c=new int[m*k];
		MainClass test=new MainClass();
		c=test.solution(a, b, m, n, k);
		for(int i=0; i<m*k; i++){
			System.out.println(c[i]);
		}
	}
	
	public int[] solution(int[] a, int[] b, int m, int n, int k){
		int[] c=new int[m*k];
		//int p=0;
		int index=0;
		for(int i=0; i<m; i++){
			for(int j=0; j<k; j++){
				int sum=0;
				for(int p=i*n, q=j; (p<(i+1)*n) && (q< b.length); p++, q=q+k){
					sum+=a[p] * b[q];
				}
				c[index++]=sum;
			}
		}
		return c;
	}
	
	/*public int add(int[] a, int[] b, int i, int j, int n, int k){
		int sum=0;
		for(int p=i*n, q=j; (p<(i+1)*n) && (q< b.length); p++, q=q+k){
			sum+=a[p] * b[q];
		}
		return sum;
	}*/
}
