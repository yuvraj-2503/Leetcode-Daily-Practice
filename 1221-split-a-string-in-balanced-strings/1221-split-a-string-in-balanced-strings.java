class Solution {
    public int balancedStringSplit(String s) {
        int lCnt =0, rCnt =0, ans=0;
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)=='L'){
                lCnt++;
            }else{
                rCnt++;
            }
            
            if(lCnt == rCnt){
                ans++;
                lCnt=0; rCnt =0;
            }
        
        }
        
        return ans;
    }
}