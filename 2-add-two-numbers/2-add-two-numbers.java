class Solution {
public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
ListNode temp = new ListNode();
ListNode curr = temp;
int sum,rem =0;
while( l1 != null || l2 != null || rem >0 ){
sum =0;
if(l1 != null){
sum = sum + rem+ l1.val;
rem =0;
l1 = l1.next;
}
if(l2 != null){
sum = sum + rem + l2.val;
rem =0;
l2 = l2.next;
}
if(l1 == null && l2 == null && rem ==1){
sum = rem;
rem =0;
}
if(sum >= 10){
sum = sum%10;
rem = 1;
}
temp.val = sum;
if(l1 == null && l2 == null && rem ==0){
break;
}
ListNode temp2 = new ListNode();
temp.next = temp2;
temp = temp2;

    }
    
    
    
    return curr;
}
}