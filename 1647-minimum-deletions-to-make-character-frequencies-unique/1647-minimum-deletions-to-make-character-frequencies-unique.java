class Solution {
    public int minDeletions(String s) {
        HashMap<Character, Integer> mp= new HashMap<>();
        
        for(char c: s.toCharArray()){
            mp.put(c, mp.getOrDefault(c, 0) + 1);
        }
        
        int ans=0;
        HashSet<Integer> st = new HashSet<>();
        for(char c: mp.keySet()){
            int f= mp.get(c);
            if(!st.contains(f)) st.add(f);
            else{
                while(f>0 && st.contains(f)){
                    f--;
                    ans++;
                }
                if(f>0) st.add(f);
            }
        }
        
        return ans;
    }
}