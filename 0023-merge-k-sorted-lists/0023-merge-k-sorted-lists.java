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
    public ListNode mergeList(ListNode h1,ListNode h2){
        if(h1==null){
            return h2;
        }
        if(h2==null){
            return h1;
        }
        ListNode temp;
        if(h1.val<=h2.val){
            temp=h1;
            h1=h1.next;
        }
        else{
            temp=h2;
            h2=h2.next;
        }
        ListNode head=temp;
        while(h1!=null && h2!=null){
            if(h1.val<=h2.val){
                temp.next=h1;
                h1=h1.next;
            }
            else{
                temp.next=h2;
                h2=h2.next;
            }
            temp=temp.next;
        }
        if(h1==null){
            temp.next=h2;
        }
        if(h2==null){
            temp.next=h1;
        }
        return head;
    }
    public ListNode Helper(ListNode lists[],int s,int e){
        if(lists.length==0){
            return null;
        }
        if(s==e){
            return lists[s];
        }
        if(s+1==e){
            return mergeList(lists[s],lists[e]);
        }
        int mid=s+(e-s)/2;
        ListNode l1=Helper(lists,s,mid);
        ListNode l2=Helper(lists,mid+1,e);
        return mergeList(l1,l2);
    }
    public ListNode mergeKLists(ListNode[] lists) {
         ListNode head = Helper(lists,0,lists.length-1);
        return head;
    }
}