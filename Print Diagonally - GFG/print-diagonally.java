//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;
class GFG
{
    public static void main(String args[])throws IOException
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            int n = sc.nextInt();
            
            int matrix[][] = new int[n][n];
            
            for(int i = 0; i < n; i++)
            {
                for(int j = 0; j < n; j++)
                 matrix[i][j] = sc.nextInt();
            }
            Solution ob = new Solution();
            ArrayList<Integer> ans = ob.downwardDigonal(n, matrix);
            for (Integer val: ans) 
                System.out.print(val+" "); 
            System.out.println();
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution{
    static ArrayList<Integer> downwardDigonal(int n, int arr[][])
    {
        // code here
        
        ArrayList<Integer> ans= new ArrayList<>();
        for(int i=0; i<n; i++){
            int r=0, c= i;
            while(c>=0){
                ans.add(arr[r][c]);
                c--;
                r++;
            }
        }
        
        for(int i=1; i<n; i++){
            int r=i, c=n-1;
            while(r<n){
                ans.add(arr[r][c]);
                r++;
                c--;
            }
        }
        
        return ans;
    }
}
