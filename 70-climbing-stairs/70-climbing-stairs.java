class Solution {
    public int climbStairs(int n) {
        int[] dp= new int[n+1];
        dp[0] = 1;
        dp[1] = 1;
        
        return util(n, dp);
        
    }
    
    public static int util(int n, int[] dp){
        if(n<=1) return 1;
        
        for(int i=2; i<=n; i++){
            dp[i] = dp[i-1] + dp[i-2];
        }
        
        return dp[n];
    }
}