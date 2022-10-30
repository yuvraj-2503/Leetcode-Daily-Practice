//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while(T-->0)
        {
            int N = Integer.parseInt(br.readLine().trim());
            Solution obj = new Solution();
            long ans = obj.NoOfChicks(N);
            System.out.println(ans);
        }
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution
{
    public long NoOfChicks(int n)
    {
        // Code here
        long[] dp= new long[n+1];
        
        dp[1] = 1;
        long ans=1;
        for(int i=2; i<=n; i++){
            if(i > 6){
                ans -= dp[i-6];
                // dp[i] = ; 
            }
            // else
            dp[i] = 2* ans;
            ans += ans *2;
        }
        
        return ans;
    }
}