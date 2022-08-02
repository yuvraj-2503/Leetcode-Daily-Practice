class Solution {
    public int prefixCount(String[] words, String pref) {
        int cnt=0;
        for(String w: words){
            if(w.startsWith(pref)){
                cnt++;
            }
        }
        
        return cnt;
    }
}