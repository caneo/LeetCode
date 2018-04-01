public class reverList {
	public static void main(String args[]){
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int[] data=new int[n];
		int i=0;
		while(i<n){
			data[i++]=in.nextInt();
		}
		System.out.println("end");
	}
}