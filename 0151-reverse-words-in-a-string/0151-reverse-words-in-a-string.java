class Solution {
    public String reverseWords(String s) {
        
        s=s.trim()+" ";
        String ans="",word="";
        int fg=0;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)!=' ')
            {
                fg=0;
                word+=s.charAt(i);
            }
            else if(fg==0)
            {
                fg=1;
                ans=word+" "+ans;
                word="";
            }
        }
        return ans.trim();
    }
}