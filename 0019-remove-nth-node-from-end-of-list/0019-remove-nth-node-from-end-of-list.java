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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head.next==null){
            return null;
        }
        ListNode start= new ListNode();
        ListNode fast= start;
        ListNode slow= start;
        slow.next=head;
        while(n-->0){
            fast= fast.next;
        }
        while(fast.next!=null){
            fast=fast.next;
            slow=slow.next;
             }
            slow.next= slow.next.next;
    
    return start.next;
    }
}
//
//1,2,3,4,5
 //   s    f