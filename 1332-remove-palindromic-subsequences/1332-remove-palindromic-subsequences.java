class Solution {
    public int removePalindromeSub(String s) {
        int i=0, j= s.length()-1;
        boolean flag = true;
        while(i<=j){
            if(s.charAt(i)!=s.charAt(j)){
                flag = false;
            }
            
            i++; j--;
        }
        
        if(flag)
            return 1;
        else 
            return 2;
    }
}