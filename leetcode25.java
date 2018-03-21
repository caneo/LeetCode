/*将一个链表每k个进行逆转
那么每k个节点进行逆转，逆转是通过每遍历一个节点，就将该节点插入到首部。
*/
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode reverseKGroup(ListNode head, int k) {
        if(head==null || k==1){ //如果链表为空，或者逆转间隔为k
            return head;
        }
        ListNode dummy=new ListNode(-1);  //要插入到首部，则需要在头部添加空节点，用于其他节点插到头部的位置
        dummy.next=head; 
        ListNode start=dummy; 
        int i=0;
        while(head!=null){  
            i++;
            if(i%k==0){ //如果到了第k个节点
                start=reverse(start, head.next); //每k个节点进行一次逆转操作
                head=start.next;
            }
            else{
                head=head.next;
            }
        }
        return dummy.next;
    }
    public ListNode reverse(ListNode start, ListNode end){ //star：起始节点。end：终止节点
        ListNode last=start.next; //第一个节点即逆转后的最后一个节点
        ListNode cur=last.next; //从第二个节点开始进行逆转
        while(cur!=end){
            last.next=cur.next; //前一个节点指向后一个节点的下一个节点
            cur.next=start.next; //后一个节点指向第一个节点
            start.next=cur; //空节点指向后一个节点
            cur=last.next;
        }
        return last;
    }
}