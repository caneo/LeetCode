import java.util.Stack;

public class tailtoheadList {
	public void solution(ListNode head){
		Stack<Integer> st=new Stack<Integer>();
		while(head!=null){
			st.push(head.val);
		}
		
		while(!st.isEmpty()){
			int temp=st.peek();
			System.out.println(temp);
			st.pop();
		}
	}
	//public 

}
