public boolean hasCir(Node head){
		Node fast=head;
		Node slow=head;
		while(slow !=null && fast !=null){
			if(slow.next!=null){
				slow=slow.next;
			}
			if(fast.next.next!=null){
				fast=fast.next.next;
			}
			if(slow == fast){
				return true;
			}
		}
		return false;
	}