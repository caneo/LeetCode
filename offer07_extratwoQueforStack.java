import java.util.LinkedList;
import java.util.Queue;

public class twoQueforStack {
	Queue<Integer> q1=new LinkedList<Integer>();
	Queue<Integer> q2=new LinkedList<Integer>();
	
	public int pop(){
		if(q1.isEmpty()){
			int temp=q2.peek();
			q1.add(temp);
			while(!q2.isEmpty()){
				q2.remove();
				temp=q2.peek();
				q1.add(temp);
			}
			return temp;
		}
		
		else{
			int temp=q1.peek();
			q2.add(temp);
			while(!q1.isEmpty()){
				q1.remove();
				temp=q1.peek();
				q2.add(temp);
			}
			return temp;
		}
	}
	
	public void push(int val){
		if(q1.isEmpty() && q2.isEmpty()){
			q1.add(val);
		}
		else if(q1.isEmpty() && !q2.isEmpty()){
			q2.add(val);
		}
		else if(!q1.isEmpty() && q2.isEmpty()){
			q1.add(val);
		}
	}
}
