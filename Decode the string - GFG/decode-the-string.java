//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG{
    public static void main(String args[])throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out=new PrintWriter(System.out);
        int t = Integer.parseInt(in.readLine());
        while(t-- > 0){
            String s = in.readLine();
            
            Solution ob = new Solution();
            out.println(ob.decodedString(s));
        }
        out.close();
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution{
    static String decodedString(String s){
        // code here
        Stack<String> st=new Stack<>();
        char c[]=s.toCharArray();
        int n=c.length;
        for(int i=0;i<n;){
            if(c[i]=='['){
                st.push("[");
                i++;
            }else if(c[i]==']'){
                String str="";
                while(st.peek().charAt(0)!='['){
                    str=st.pop()+str;
                }
                st.pop();
                int times=Integer.parseInt(st.pop());
                String spare=str;
                while(times-->1){
                    str+=spare;
                }
                st.push(str);
                i++;
            }else if(c[i]>='0' && c[i]<='9'){
                String str="";
                while(i<n && c[i]>='0' && c[i]<='9'){
                    str+=c[i];
                    i++;
                }
                st.push(str);
            }else{
                String str="";
                while(i<n && c[i]>='a' && c[i]<='z'){
                    str+=c[i];
                    i++;
                }
                st.push(str);
            }
        }
        String res="";
        while(!st.isEmpty()){
            res=st.pop()+res;
        }
        return res;
    }
}