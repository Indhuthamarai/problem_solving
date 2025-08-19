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
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null || head.next==null)
        {
            return head;
        }
        int length=1,i=0;
        ListNode temp=head;
        while(temp.next!=null)
        {
            temp=temp.next;
            length++;
        }
        int pos=k%length;
        if(pos==0)
        {
            return head;
        }
        ListNode current=head;
        while(i<length-pos-1 && current.next!=null)
        {
            current=current.next;
            i++;
        }
        ListNode newHead=current.next;
        current.next=null;
        temp.next=head;
        return newHead;
    }
}