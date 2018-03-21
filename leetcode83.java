/*
去掉排序链表重复的数字节点，重复的数字都要去掉。Given 1->1->1->2->3, return 2->3.
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
    public ListNode deleteDuplicates(ListNode head) {
        ListNode dummy=new ListNode(-1);
        dummy.next=head;
        ListNode pre=dummy;
        ListNode cur=head;
        while(cur!=null){
            while(cur.next!=null && cur.val==cur.next.val){ //判断当前节点的值是否与后面一个节点的值相同，相同则继续遍历。
                cur=cur.next; //
                //pre.next=cur.next;
            }
            if(pre.next==cur){ //如果不存在重复的节点。则pre向前移
                pre=pre.next;
            }
            else{
                pre.next=cur.next; //如果存在重复节点。那么pre直接指向下一个不重复的节点
            }
            cur=cur.next;
        }
        return dummy.next;
    }
}