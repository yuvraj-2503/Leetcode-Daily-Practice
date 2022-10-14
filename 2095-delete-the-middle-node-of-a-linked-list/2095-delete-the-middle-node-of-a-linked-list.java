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
    public ListNode deleteMiddle(ListNode head) {
        if(head==null){
            return null;
        }
        
        if(head.next==null){
            return null;
        }
        ListNode fast = head, slow= head, prev= null;
        
        while(fast != null && fast.next != null){
            prev= slow;
            slow= slow.next;
            fast= fast.next.next;
            
        }
        
       
        
        prev.next = slow.next;
        return head;
    }
}