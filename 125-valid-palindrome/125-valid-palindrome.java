class Solution {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase();
        String ans = "";
        
        for(int i=0; i<s.length(); i++){
            if((s.charAt(i) >= 'a' && s.charAt(i) <= 'z')){
               ans += s.charAt(i); 
            }
            
            if((s.charAt(i) >= '0' && s.charAt(i) <= '9')){
               ans += s.charAt(i); 
            }
        }
        
        // System.out.println(ans);
        
        int i=0, j= ans.length()-1;
        while(i<j){
            if(ans.charAt(i) != ans.charAt(j)){
                return false;
            }
            
            i++; j--;
        }
        return true;
    }
}