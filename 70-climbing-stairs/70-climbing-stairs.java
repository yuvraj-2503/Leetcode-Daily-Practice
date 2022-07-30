class Solution {
    public int climbStairs(int n) {
        int[] dp= new int[n+1];
        for(int i=0; i<=n; i++){
            dp[i] = -1;
        }
        
        return util(n, dp);
        
    }
    
    public static int util(int n, int[] dp){
        if(n<=1) return 1;
        
        if(dp[(int)n] != -1){
            return dp[(int)n];
        }
        
        return dp[(int)n] = util(n-1, dp) + util(n-2, dp);
    }
}