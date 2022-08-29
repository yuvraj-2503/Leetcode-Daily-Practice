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
        ListNode tmp = head;
        int sz=0;
        while(tmp != null){
            sz++;
            tmp= tmp.next;
        }
        
        if(n>sz){
            return head;
        }
        if(sz == 1){
            return null;
        }
        
        if(sz - n == 0){
            head = head.next;
            return head;
        }
    
        int fs = sz - n;
        
        tmp = head;
        int i=1;
        while(i<fs){
            i++;
            tmp = tmp.next;
        }
        
        tmp.next = tmp.next.next;
        return head;
        
        
        
    }
}