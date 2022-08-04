class Solution {
    public int mirrorReflection(int p, int q) {
        int m= q/ gcd(p,q);
        int n= p/ gcd(p,q);
        
        if(m%2==0){
            return 0;
        }else{
            if(n%2==1){
                return 1;
            }else return 2;
        }
    }
    int gcd(int x, int y){
        if(y==0){
            return x;
        }
        
        return gcd(y, x%y);
    }
}