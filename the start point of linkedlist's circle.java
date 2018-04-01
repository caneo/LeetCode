public Node posMet(Node head){
		Node fast=head;
		Node slow=head;
		while(fast !=null && slow !=null){
			slow=slow.next;
			fast=fast.next.next;
			if(fast==slow){
				break;
			}
		}
		if(fast==null || fast.next==null){
			return null;
		}
		slow=head;
		while(slow!=fast){
			slow=slow.next;
			fast=fast.next;
		}
		return slow;
	}   
