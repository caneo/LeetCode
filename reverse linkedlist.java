public static void reverse(Node head){
    //����1
    
	if (head==null||head.next==null||head.next.next==null){
        return;
    }
    
//����2
    
 	Node cur=head.next.next;
    
	head.next.next=null;
    
	while (cur!=null){
       //����3
        
		Node temp=cur.next;
       //����4
        
		cur.next=head.next;
      //����5
        
		head.next=cur;
     //����6        
        
		cur=temp;
    }
}




private static Node revert(Node head) {
    
	if (head == null || head.nextNode == null) {
        // ����β���
       
		 return head;
    }
    // һֱ��ջ
    
	Node revertHead = revert(head.nextNode);
    // ��ջ����ֵnextNode����
    
	head.nextNode.nextNode = head;
    
	head.nextNode = null;
    // ����β��㣨���ú��ͷ��㣩
    
	return revertHead;

}

