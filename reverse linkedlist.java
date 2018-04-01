public static void reverse(Node head){
    //步骤1
    
	if (head==null||head.next==null||head.next.next==null){
        return;
    }
    
//步骤2
    
 	Node cur=head.next.next;
    
	head.next.next=null;
    
	while (cur!=null){
       //步骤3
        
		Node temp=cur.next;
       //步骤4
        
		cur.next=head.next;
      //步骤5
        
		head.next=cur;
     //步骤6        
        
		cur=temp;
    }
}




private static Node revert(Node head) {
    
	if (head == null || head.nextNode == null) {
        // 到达尾结点
       
		 return head;
    }
    // 一直入栈
    
	Node revertHead = revert(head.nextNode);
    // 出栈并赋值nextNode对象
    
	head.nextNode.nextNode = head;
    
	head.nextNode = null;
    // 返回尾结点（逆置后的头结点）
    
	return revertHead;

}

