//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG{
    public static void main(String args[])throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(in.readLine());
        while(t-- > 0){
            String arr[] = in.readLine().trim().split("\\s+");
            int n = Integer.parseInt(arr[0]);
            int m = Integer.parseInt(arr[1]);
            int mat[][] = new int[n][m];
            for(int i = 0;i < n;i++){
                String a[] = in.readLine().trim().split("\\s+");
                for(int j = 0;j < m;j++)
                    mat[i][j] = Integer.parseInt(a[j]);
            }
            String a1[] = in.readLine().trim().split("\\s+");
            int ty = Integer.parseInt(a1[0]);
            int i = Integer.parseInt(a1[1]);
            int j = Integer.parseInt(a1[2]);
            
            Solution ob = new Solution();
            System.out.println(ob.hopscotch(n, m, mat, ty, i, j));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution{
    static int hopscotch(int n, int m, int mat[][], int ty, int i, int j) 
    {
        // code here
        int sum =0;
        if(ty == 0){
            if(j%2==1){
                
        
                int[] dirX ={ -1, 0,0,1,1,1};
                int[] dirY ={0,-1,1,-1,0,1};
                for(int k=0; k<6; k++){
                    int newX = i+dirX[k];
                    int newY = j+dirY[k];
                    if(newX >= 0 && newY >=0 && newX<n && newY<m){
                        sum += mat[newX][newY];
                    }
                }
            }else{
                int[] dirX ={-1,-1,-1,0,1,0 };
                int[] dirY ={0,-1,1,-1,0,1};
                for(int k=0; k<6; k++){
                    int newX = i+dirX[k];
                    int newY = j+dirY[k];
                    if(newX >= 0 && newY >=0 && newX<n && newY<m){
                        sum += mat[newX][newY];
                    }
                }
            }
            return sum;
            
        }else{
            if(j%2==1){
                int[] dirX = { -1,-1,-2,-1,-1,0,0,1,1,2,2,2}; // y  odd
                int[] dirY = { -2,-1,0,1,2,-2,2,-2,2,-1,0,1};
                for(int k=0; k<12; k++){
                    int newX = i+dirX[k];
                    int newY = j+dirY[k];
                    // System.out.println(newX + " " + newY);
                    if(newX >= 0 && newY >=0 && newX<n && newY<m){
                        sum += mat[newX][newY];
                    }
                }
            }else{
                int[] dirX = {-2,-2,-2,-1,-1,0,0,1,1,1,1,2}; // y  even
                int[] dirY = {-1,0,1,-2,2,-2,2,-2,-1,1,2,0};
                for(int k=0; k<12; k++){
                    int newX = i+dirX[k];
                    int newY = j+dirY[k];
                    // System.out.println(newX + " " + newY);
                    if(newX >= 0 && newY >=0 && newX<n && newY<m){
                        sum += mat[newX][newY];
                    }
                }
            }
            
            return sum;
        }
    }
}