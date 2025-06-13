/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public void reorderList(ListNode head) {
        if (head==null || head.next==null){
            return;
        }
        ListNode fast=head,slow=head;
        while(fast.next!=null && fast.next.next!=null){
            fast=fast.next.next;
            slow=slow.next;
        }
        ListNode current=slow.next,prev=null,next=null;
        while(current!=null){
            next=current.next;
            current.next=prev;
            prev=current;
            current=next;
        }
        slow.next=null;
        current=head;
        ListNode node=prev;
        while(node!=null){
            ListNode t1=current.next,t2=node.next;
            current.next=node;
            node.next=t1;
            current=t1;
            node=t2;
        }
    }
}