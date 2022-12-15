//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    // Position this line where user code will be pasted.
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            int N = Integer.parseInt(read.readLine());
            Solution ob = new Solution();
            System.out.println(ob.BalancedString(N));
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    static String BalancedString(int n) {
        // code here
        String ans = "";
        if(n%2==0){
           int q= n/26;
           int r = n%26;
           while(q-->0){
               ans += "abcdefghijklmnopqrstuvwxyz";
           }
           r = r/2;
           char c = 'a';
           for(int i=0; i<r; i++){
               ans += c;
               c = (char)((int)c+1);
           }
           
           c = (char)('z' - r + 1);
           for(int i=0; i<r; i++){
               ans += c;
               c = (char)((int)c+1);
           }
        }else{
           int q= n/26;
           int r = n%26;
           while(q-->0){
               ans += "abcdefghijklmnopqrstuvwxyz";
           }
           
            int sum = SOD(n);
            
            if(sum % 2 == 0){
                char c = 'a';
               for(int i=0; i<r/2 + 1; i++){
                   ans += c;
                   c = (char)((int)c+1);
               }
               
               c = (char)('z' - (r/2) + 1);
               for(int i=0; i<r/2; i++){
                   ans += c;
                   c = (char)((int)c+1);
               }
            }else{
                char c = 'a';
               for(int i=0; i<r/2; i++){
                   ans += c;
                   c = (char)((int)c+1);
               }
               
               c = (char)('z' - (r/2));
               for(int i=0; i<(r/2)+1; i++){
                   ans += c;
                   c = (char)((int)c+1);
               }
            }
        }
        
        return ans;
    }
    
    static int SOD(int n){
        int sum = 0;
        while(n>0){
            sum += (n%10);
            n /= 10;
        }
        
        return sum;
    }
}