class Solution {
        public boolean canConstruct(String r, String m) {
            HashMap<Character, Integer> mp= new HashMap<>();
            for(int i=0;i<m.length();i++){
                mp.put(m.charAt(i), mp.getOrDefault(m.charAt(i), 0)+1);
            }
            
            for(int i=0;i<r.length();i++){
                if(!mp.containsKey(r.charAt(i))){
                    return false;
                }else{
                    if(mp.get(r.charAt(i))==1){
                        mp.remove(r.charAt(i));
                    }else{
                        mp.put(r.charAt(i), mp.get(r.charAt(i))-1);
                    }
                }
            }
            
            return true;
        }
    }