//{ Driver Code Starts
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t;
        t = Integer.parseInt(br.readLine());
        while(t-- > 0){
            //br.readLine();
            String s;
            s = br.readLine();
            
            Solution obj = new Solution();
            int res = obj.beautySum(s);
            
            System.out.println(res);
            
        }
    }
}

// } Driver Code Ends

        

class Solution {
    public static int beautySum(String s) {
        // code here
        int n= s.length();
        int ans = 0;
        for(int i=3; i<=n; i++){
            int l=0, j= i;
            int[] freq= new int[26];
            for(int k=l; k<j; k++){
                freq[s.charAt(k)-'a']++;
            }
            
            ans += beauty(freq);
            
            while(j<n){
                freq[s.charAt(j)-'a']++;
                freq[s.charAt(l)-'a']--;
                ans += beauty(freq);
                l++; 
                j++;
            }
            
            
            
        }
        
        return ans;
    }
    
    static int beauty(int[] freq){
        int mx=0, mn= Integer.MAX_VALUE;
        for(int x: freq){
            // if(x!=0){
            mx= Math.max(mx, x);
            mn= Math.min(mn, x);
            // }
        }
        return mx-mn;
    }
}
