class Solution {
    public boolean isSameAfterReversals(int num) {
        int rev1 = reverse(num);
        int rev2 = reverse(rev1);
        return rev2 == num;
    }
    
    public int reverse(int n){
        int rev =0;
        while(n !=0 ){
            int d = n%10;
            rev = rev * 10 + d;
            n /= 10;
        }
        
        return rev;
    }
}