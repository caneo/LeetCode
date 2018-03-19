/*
two non-empty linked lists representing two non-negative integers. 
The digits are stored in reverse order and each of their nodes contain 
a single digit. Add the two numbers and return it as a linked list.
*/
 /*Definition for singly-linked list.
 public class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
 }*/
 
public class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
	        ListNode l3=new ListNode(0); //l3 stores the sum of two reverse-order lists.
	        ListNode head=l3; 
	        int sum=0;
            int temp=0;
	        while(l1!=null || l2!=null){ //遍历两个链表l1，l2
                int val1=0;
                if (l1!=null){
                    val1=l1.val;
                    l1=l1.next;
                }
                int val2=0;
                if(l2!=null){
                    val2=l2.val;
                    l2=l2.next;
                }
	        	sum=temp+val1+val2; //当前位的和加上前一个位上的进位
	            l3.val=sum%10;
                temp=sum/10; //进位
                if ((l1!=null || l2!=null)|| temp!=0){
                    l3.next=new ListNode(temp); //如果已经到了最高位的两个数相加，并且超过了10。比如5+5
	                l3=l3.next;
                }
	        }
	        l3=head;
	        return l3;
    }
}