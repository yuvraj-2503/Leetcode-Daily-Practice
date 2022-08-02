class Solution {
    public String kthDistinct(String[] arr, int k) {
        HashMap<String, Integer> mp= new HashMap<>();
        for(String x: arr){
            mp.put(x, mp.getOrDefault(x, 0) + 1);
            
        }
        
        int c=0;
        for(String x: arr){
            if(mp.get(x)==1){
                c++;
            }
            
            if(c==k){
                return x;
            }
        }
        
        return "";
    }
}