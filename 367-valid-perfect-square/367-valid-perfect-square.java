class Solution {
    public boolean isPerfectSquare(int num) {
        long l= 1, r= num;
        
        while(l<=r){
            long mid = l+ (r-l)/2;
            long p= mid* mid;
            
            if(p==num){
                return true;
            }else if(p>num){
                r = mid-1;
            }else
                l= mid+1;
        }
        
        return false;
    }
}