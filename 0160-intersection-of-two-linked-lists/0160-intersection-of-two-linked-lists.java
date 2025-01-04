/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode h1, ListNode h2) {
        ListNode s=h1;
        ListNode f=h2;
        if(h1==h2){
            return h1;
        }
        // while(s!=null && f!=null){
        //     s=s.next;
        //     f=f.next;
        // }
        while(s!=f){
            if(s==null){
                s= h2;
            }
            else{
                s=s.next;
            }
            if(f==null){
                f= h1;
            }
            else{
                 f=f.next;
            }
        }
        
        
        return s;
    }
}