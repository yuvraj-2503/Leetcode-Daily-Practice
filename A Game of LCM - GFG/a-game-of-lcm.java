//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            int N = Integer.parseInt(read.readLine());
            Solution ob = new Solution();
            System.out.println(ob.maxGcd(N));
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    long maxGcd(int n) {
        // code here
       return Math.max(solve(n), solve(n-1));
    }
    
    long solve(int n){
        long ans = n, cnt=1;
        for(int i=n-1; i>=2; i--){
            if(gcd(ans, i) == 1){
                ans *= i;
                cnt++;
            }
            
            if(cnt==4) return ans;
        }
        return ans;
    }
    
    long gcd(long a, long b){
        if(b==0){
            return a;
        }
        
        return gcd(b, a%b);
    }
}