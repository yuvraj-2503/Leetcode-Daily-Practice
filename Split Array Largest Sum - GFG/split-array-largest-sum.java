//{ Driver Code Starts
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            
            String St[] = read.readLine().split(" ");
            
            int N = Integer.parseInt(St[0]);
            int K = Integer.parseInt(St[1]);
            
            String S[] = read.readLine().split(" ");
            
            int[] arr = new int[N];
            
            for(int i=0 ; i<N ; i++)
                arr[i] = Integer.parseInt(S[i]);

            Solution ob = new Solution();
            System.out.println(ob.splitArray(arr,N,K));
        }
    }
}
// } Driver Code Ends


class Solution {
    static int splitArray(int[] arr , int n, int k) {
        // code here
        int low = 0, high = 0;
        for(int x: arr){
            low = Math.max(low, x);
            high += x;
        }
        
        int ans = 0;
        while(low <= high){
            int mid = (high - low) / 2 + low;
            
            int cnt = 1, sum = 0;
            for(int i=0; i<n; i++){
                sum += arr[i];
                if(sum > mid){
                    cnt++;
                    sum = arr[i];
                }
            }
            
            if(cnt <= k){
                ans = mid;
                high = mid - 1;
            }else{
                low = mid + 1;
            }
            
        }
        
        return ans;
    }
};