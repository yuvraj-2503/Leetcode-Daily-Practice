class Solution {
    public boolean areOccurrencesEqual(String s) {
        HashMap<Character, Integer> mp= new HashMap<>();
        
        for(char c: s.toCharArray()){
            mp.put(c, mp.getOrDefault(c,0)+ 1);
        }
        
    
        HashSet<Integer> st = new HashSet<>();
        for(char x: mp.keySet()){
            st.add(mp.get(x));
        }
        
        return st.size()==1;
    }
}