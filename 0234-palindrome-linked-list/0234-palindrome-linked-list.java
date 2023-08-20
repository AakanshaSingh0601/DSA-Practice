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
     StringBuilder sb = new StringBuilder();
    public boolean isPalindrome(ListNode head) {
        solve(head);
       // System.out.println(sb);
        String og= sb.toString();
        String rev = sb.reverse().toString();
        if(rev.equals(og)) return true;
        
        else return false;
    }
    
    
    private  void solve(ListNode cur){
        if(cur==null) return ;
        
        sb.append(cur.val);
            solve(cur.next);
        
    }
}
