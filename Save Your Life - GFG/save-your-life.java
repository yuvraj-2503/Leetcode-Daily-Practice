//{ Driver Code Starts
import java.io.*;
import java.util.*;

// } Driver Code Ends
class Solution{
    static String maxSum(String w,char x[],int b[], int n){
        //code here
        
        HashMap<Character, Integer> mp= new HashMap<>();
        for(int i=0; i<n; i++){
            mp.put(x[i], b[i]);
        }
        
        int max= Integer.MIN_VALUE, curr_sum=0;
        StringBuilder ans= new StringBuilder();
        StringBuilder res= new StringBuilder();
        for(char c: w.toCharArray()){
            int d=0;
            
            if(mp.containsKey(c)){
                d= mp.get(c);
            }else{
                d= c; 
            }
            
            curr_sum += d;
            res.append(c);
            if(max< curr_sum){
                max= curr_sum;
                ans= new StringBuilder(res);
                
            }
            
            if(curr_sum <0) {
                curr_sum=0;
                res= new StringBuilder();
            }
        }
        
        return ans.toString();
    }
}

//{ Driver Code Starts.
class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            String w = read.readLine();
            int n = Integer.parseInt(read.readLine());
            String TE[] = read.readLine().trim().split(" ");
            char x[] = new char[n];
            for(int i = 0;i<n;i++)
            {
                x[i] = TE[i].charAt(0);
            }
            
            String TR[] = read.readLine().trim().split(" ");
            int b[] = new int[n];
            for(int i = 0;i<n;i++)
            {
                b[i] = Integer.parseInt(TR[i]);
            }
           
            Solution ob = new Solution();
            System.out.println(ob.maxSum(w,x,b,n));
        }
    }
}
// } Driver Code Ends