//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t =
            Integer.parseInt(br.readLine().trim()); // Inputting the testcases
        while (t-- > 0) {

            int i = 0;
            int N = Integer.parseInt(br.readLine().trim());

            int start[] = new int[N];
            int end[] = new int[N];

            String inputLine2[] = br.readLine().trim().split(" ");
            String inputLine3[] = br.readLine().trim().split(" ");
            
            for (i = 0; i < N; i++) {
                start[i] = Integer.parseInt(inputLine2[i]);
                end[i] = Integer.parseInt(inputLine3[i]);
            }
            
            Solution ob = new Solution();
            System.out.println(ob.minLaptops(N, start, end));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {
    public int minLaptops(int n, int[] start, int[] end) {
        // code here
        ArrayList<int[]> arr= new ArrayList<>();
        for(int i=0; i<n; i++){
            arr.add(new int[]{start[i], +1});
            arr.add(new int[]{end[i], -1});
        }
        
        Collections.sort(arr, (a,b) -> {
            return (a[0] - b[0]) == 0 ? a[1] - b[1] : a[0] - b[0];
        });
        
        // for(int[] x: arr){
        //     System.out.println(x[0] + " " + x[1]);
        // }
        
        int cnt = 0, ans = 0;
        for(int[] x: arr){
            cnt += x[1];
            ans = Math.max(cnt, ans);
        }
        
        
        return ans;
    }
}