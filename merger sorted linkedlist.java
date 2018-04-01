public Node SortList(Node l1, Node l2){
		Node l3=null;
		while(l1!=null || l2!=null){
			if(l1.val < l2.val){
				l3.next=l1;
				l1=l1.next;
			}
			else{
				l3.next=l2;
				l2=l2.next;
			}
		}
		while(l1!=null){
			l3.next=l1;
			l1=l1.next;
		}
		while(l2!=null){
			l3.next=l2;
			l2=l2.next;
		}
		return l3;
	}
	
	public Node SortLists(Node l1, Node l2){
		if(l1!=null){
			return l2;
		}
		if(l2!=null){
			return l1;
		}
		if(l1.val <l2.val){
			l1.next=SortLists(l1.next,l2);
			return l1;
		}
		else{
			l2.next=SortLists(l1,l2.next);
			return l2;
		}
	}