class Solution {
    public int countWords(String[] words1, String[] words2) {
        HashMap<String, Integer> mp1= new HashMap<>();
        HashMap<String, Integer> mp2= new HashMap<>();
        
        for(int i=0; i<words1.length; i++){
            mp1.put(words1[i], mp1.getOrDefault(words1[i], 0) + 1);
        }
        
        for(int i=0; i<words2.length; i++){
            mp2.put(words2[i], mp2.getOrDefault(words2[i], 0) + 1);
        }
        
        int ans =0;
        for(String x: mp1.keySet()){
            if(mp2.containsKey(x)){
                if(mp1.get(x) == 1 && mp2.get(x) == 1){
                    ans++;
                }
            }
        }
        
        return ans;
    }
}