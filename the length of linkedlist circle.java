public int lenCir(Node head){
		boolean flag=false;
		int len = 0;
		Node slow=head;
		Node fast=head;
		while(fast!=null && slow!=null){
			if(slow.next!=null){
				slow=slow.next;
			}
			if(fast.next.next!=null){
				fast=fast.next.next;
			}
			if(flag==false && fast==slow ){
				flag=true;
				len=1;
				continue;
			}
			if(flag==true && fast==slow ){
				//len=0;
				break;
			}
			len++;
		}
		return len;
		
	}