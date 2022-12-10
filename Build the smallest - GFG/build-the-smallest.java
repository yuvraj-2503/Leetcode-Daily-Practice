//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.io.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            int N = Integer.parseInt(read.readLine());
            String str = read.readLine();
            Solution ob = new Solution();

            System.out.println(ob.buildLowestNumber(str,N));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {
    static String buildLowestNumber(String str, int k) {
        // code here
        int n = str.length();
        Stack<Character> st = new Stack<>();
        StringBuffer ans = new StringBuffer();
        for(int i=0; i<n; i++){
            char c = str.charAt(i);
            while(!st.isEmpty() && st.peek() > c && k>0){
                st.pop();
                k--;
            }
            
            st.push(c);
        }
        
        while(!st.isEmpty() && k>0){
            st.pop();
            k--;
        }
        
        
        while(!st.isEmpty()){
            ans.append(st.pop());
        }
        
        while(ans.length()>0 && ans.charAt(ans.length() - 1) == '0'){
            ans.deleteCharAt(ans.length()-1);
        }
        
        if(ans.length() == 0){
            return "0";
        }
        
        
        return ans.reverse().toString();
    }
}