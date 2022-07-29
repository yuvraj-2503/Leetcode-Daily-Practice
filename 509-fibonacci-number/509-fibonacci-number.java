class Solution {

    public int util(int n, int[] dp){
        if(n<=1){
            return n;
        }
        
        if(dp[n] != -1) return dp[n];
        
        return dp[n] = util(n-1, dp) + util(n-2, dp);
    }
    
    public int fib(int n) {
        int[] dp= new int[n+1];
        for(int i=0; i<=n; i++){
            dp[i] = -1;
        }
        
        return util(n, dp);
    }
}