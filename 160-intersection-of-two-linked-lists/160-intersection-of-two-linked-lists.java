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
   public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA==headB)
            return headA;
        ListNode first= headA;
        ListNode second= headB;
        while (first != null || second != null){
            first= (first==null)?headB:first.next;
            second= (second==null)?headA:second.next;
            if (first==second) return first;
        }
        return null;
    }
}