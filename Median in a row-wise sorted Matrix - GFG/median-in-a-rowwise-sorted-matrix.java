//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;


class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            String S[] = read.readLine().split(" ");
            int R = Integer.parseInt(S[0]);
            int C = Integer.parseInt(S[1]);
            int matrix[][] = new int[R][C];
            int c = 0;
            for(int i = 0; i < R; i++){
                String line[]=read.readLine().trim().split(" ");
                for(int j = 0; j < C; j++){
                    matrix[i][j] = Integer.parseInt(line[j]);
                }
            }
            Solution ob = new Solution();
            int ans = ob.median(matrix, R, C);
            System.out.println(ans);
        }
    }
}

// } Driver Code Ends


//User function Template for Java
class Solution {
    int median(int matrix[][], int R, int C) {
        // code here 
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<R;i++){
            if(matrix[i][0]<min)min=matrix[i][0];
            if(matrix[i][C-1]>max)max=matrix[i][C-1];
        }

        int desired=(R*C +1)/2;

        while(min<max){
            int mid=(min+max)/2;

            int smaller=0;
            for(int i=0;i<R;i++){
                int l=0;
                int r=C-1;
                while(l<r){
                    int m=(l+r)/2;
                    if(matrix[i][m]<=mid){
                        l=m+1;
                    }else{
                        r=m;
                    }
                }
                smaller+=l;
                if(matrix[i][l]<=mid)smaller++;
            }

            if(smaller<desired){
                min=mid+1;
            }else{
                max=mid;
            }
        }
        return min;
    }
}