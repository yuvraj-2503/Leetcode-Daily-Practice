class Solution {
    public String reverseWords(String s) {
        String[] sarr= s.split(" ");
        StringBuffer ans= new StringBuffer();
        for(String x: sarr){
            ans.append(reverse(x));
            ans.append(" ");
        }
        
        return ans.toString().trim();
    }

    public String reverse(String s){
        StringBuffer sb= new StringBuffer(s);
        sb.reverse();
        return sb.toString();
    }
}