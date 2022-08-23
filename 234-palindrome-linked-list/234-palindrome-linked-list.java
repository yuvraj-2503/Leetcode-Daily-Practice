class Solution {

    public boolean isPalindrome(ListNode head) {
        if(head == null || head.next == null) return true;
        
        ListNode[] pointers = getPointers(head);
        ListNode slow = pointers[0], fast = pointers[1];
        
        //if list is even, fast.next will not point to null.
        if(fast.next != null) slow = slow.next;
        
        //Now reverse the second half and start comparing each value.
        slow = reverse(slow, null);
        
        return compareList(head, slow);
    }
    
    private ListNode[] getPointers(ListNode head){
        //TURTLE HARE METHOD
        ListNode slow = head, fast = head, temp = head;
        while(fast.next != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return new ListNode[]{slow, fast};
    }
    
    private boolean compareList(ListNode head1, ListNode head2){
        
        while(head1 != null && head2 != null){
            if(head1.val != head2.val) return false;
            head1 = head1.next;
            head2 = head2.next;
        }
        
        return true;
    }

    private ListNode reverse(ListNode node, ListNode prev){
        if(node == null) return prev;
        ListNode next = node.next;
        node.next = prev;
        return prev = reverse(next, node);
    }
    
}