import java.util.Stack;
public class twoStackforQueue {
	
	Stack<Integer> s1 = new Stack<Integer>();
	Stack<Integer> s2 = new Stack<Integer>();
	
	public void push(int val){
		s1.push(val);
	}
	public int pop(){
		if(s2.isEmpty()){
			while(!s1.isEmpty()){
				int temp=s1.pop();
				s2.push(temp);
			}
		}
		/*else{
			return s2.pop();
		}*/
		 return s2.pop();
	}

}
