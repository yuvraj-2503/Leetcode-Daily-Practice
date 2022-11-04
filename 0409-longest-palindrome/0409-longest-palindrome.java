class Solution {
    public int longestPalindrome(String s) {
        HashMap<Character, Integer> mp= new HashMap<>();
        for(char x: s.toCharArray()){
            mp.put(x, mp.getOrDefault(x, 0) + 1);
        }
        
        int ans = 0;
        for(char x: mp.keySet()){
            if(mp.get(x) % 2==0){
                ans += mp.get(x);
            }else{
                if(mp.get(x) > 1){
                    ans += mp.get(x)-1;
                }
            }
        }
        
        for(char x: mp.keySet()){
            if(mp.get(x) %2 == 1){
                ans++;
                break;
            }
        }
        
        return ans;
        
        
    }
}