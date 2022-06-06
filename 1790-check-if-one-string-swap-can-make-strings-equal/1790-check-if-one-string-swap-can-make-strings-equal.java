class Solution {
    public boolean areAlmostEqual(String s1, String s2) {
        int[] cnt= new int[26];
        int c=0;
        for(int i=0;i<s1.length();i++){
            if(s1.charAt(i)!=s2.charAt(i)) c++;
            
            cnt[s1.charAt(i)-'a']++;
            cnt[s2.charAt(i)-'a']--;
        }
        
        for(int i=0;i<cnt.length;i++){
            if(cnt[i]!=0){
                return false;
            }
        }
        
        return c==0 || c==2;
    }
}