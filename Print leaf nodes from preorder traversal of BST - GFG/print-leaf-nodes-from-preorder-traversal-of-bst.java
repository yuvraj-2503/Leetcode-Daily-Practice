//{ Driver Code Starts
//Initial Template for Java
import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(read.readLine().trim());
        while(T-->0)
        {
            int N = Integer.parseInt(read.readLine());
            String input_line[] = read.readLine().trim().split("\\s+");
            int arr[]= new int[N];
            for(int i = 0; i < N; i++)
                arr[i] = Integer.parseInt(input_line[i]);
            Solution ob = new Solution();
            int[] ans = ob.leafNodes(arr, N);
            for(int i = 0; i < ans.length; i++)
            {
                System.out.print(ans[i] + " ");
            }
            System.out.println();
        }
    }
}

// } Driver Code Ends


//User function Template for Java
class Solution
{
    public int[] leafNodes(int arr[], int n)
    {
        // code here
        ArrayList<Integer> lst= new ArrayList<>();
        Stack<Integer> st= new Stack<>();
        
        st.push(arr[0]);
        
        for(int i=1; i<n; i++){
            if(arr[i] < st.peek()){
                st.push(arr[i]);
            }else{
                int preS = st.size();
                int tmp= st.peek();
                while(!st.isEmpty() && arr[i] > st.peek()){
                    st.pop();
                }
                
                st.push(arr[i]);
                
                if(preS > st.size()){
                    lst.add(tmp);
                }
            }
        }
        
        
        lst.add(st.peek());
        int[] ans = new int[lst.size()];
        int idx=0;
        for(int x: lst){
            ans[idx++] = x;
        }
        
        return ans;
    }
}