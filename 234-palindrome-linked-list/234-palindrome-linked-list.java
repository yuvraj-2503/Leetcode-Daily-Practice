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
    public boolean isPalindrome(ListNode head) {
        ListNode tmp= head;
        
        int n = 0;
        while(tmp != null){
            tmp = tmp.next;
            n++;
        }
        
        int k = (int)Math.ceil(n/2);
        int i=1;
        tmp = head;
        while(i<=k){
            i++;
            tmp = tmp.next;
        }
        
        ListNode head2 = reverseList(tmp);
        while(head != null && head2 != null){
            
            if(head.val != head2.val) return false;
            
            head = head.next;
            head2 = head2.next;
        }
        
        return true;
        
        
    }
    
    
    public ListNode reverseList(ListNode head){
        if(head == null || head.next == null){
            return head;
        }

        ListNode newHead = reverseList(head.next);
        head.next.next = head;
        head.next = null;
        return newHead;
    }
}