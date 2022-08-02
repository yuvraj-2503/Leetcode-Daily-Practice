class Solution {
    public int countPrefixes(String[] words, String s) {
        int cnt=0;
        for(String w: words){
            if(s.startsWith(w)){
                cnt++;
            }
        }
        
        return cnt;
    }
}