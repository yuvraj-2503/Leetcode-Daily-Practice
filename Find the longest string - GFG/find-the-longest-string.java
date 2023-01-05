//{ Driver Code Starts
import java.io.*;
import java.util.*;


class StringArray
{
    public static String[] input(BufferedReader br, int n) throws IOException
    {
        String[] s = br.readLine().trim().split(" ");
        return s;
    }

    public static void print(String[] a)
    {
        for(String e : a)
            System.out.print(e + " ");
        System.out.println();
    }

    public static void print(ArrayList<String> a)
    {
        for(String e : a)
            System.out.print(e + " ");
        System.out.println();
    }
}

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t;
        t = Integer.parseInt(br.readLine());
        while(t-- > 0){
            
            int n;
            n = Integer.parseInt(br.readLine());
            
            
            String[] arr = StringArray.input(br, n);
            
            Solution obj = new Solution();
            String res = obj.longestString(n, arr);
            
            System.out.println(res);
            
        }
    }
}

// } Driver Code Ends


class Solution {
    public static String longestString(int n, String[] arr) {
        // code here
        
        Set<String> st= new HashSet<>();
        for(String s: arr){
            st.add(s);
        }
        
        String ans = "";
        for(String s: arr){
            if(s.length() >= ans.length()){
                if(allPrefix(s, st)){
                    if(s.length() > ans.length()){
                        ans = s;
                    }else{
                        if(s.compareTo(ans) < 0){
                            ans = s;
                        }
                    }
                }
            }
        }
        
        return ans;
    }
    
    static boolean allPrefix(String s, Set<String> st){
        for(int i=1; i<=s.length(); i++){
            String sb = s.substring(0, i);
            if(!st.contains(sb)) return false;
        }
        return true;
    }
}
        
