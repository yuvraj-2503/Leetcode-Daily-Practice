class Solution {
    public String interpret(String s) {
        String ans = "";
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) == 'G'){
                ans += 'G';
            }else if(s.charAt(i)=='('){
                if(s.charAt(i+1)== ')'){
                    ans += 'o';
                }else{
                    ans += "al";
                }
            }
        }
        
        return ans;
    }
}