class Solution {
    public int[] sortByBits(int[] arr) {
        HashMap<Integer, List<Integer>> mp= new HashMap<>();
        for(int x: arr){
            int sb = cntSetBits(x);
            if(mp.containsKey(sb)){
                List<Integer> arr2= mp.get(sb);
                arr2.add(x);
                Collections.sort(arr2);
            }else{
                List<Integer> list = new ArrayList<>();
                list.add(x);
                
                mp.put(sb, list);
            }
        }
        
        int[] ans = new int[arr.length];
        
        int idx=0;
        
        for(int x: mp.keySet()){
            
            for(int y : mp.get(x)){
                ans[idx++] = y;
            }
        }
        
        // for()
        
        return ans;
    }
    
    int cntSetBits(int n){
        int cnt=0;
        while(n>0){
            if((n&1)==1){
                cnt++;
            }
            
            n = n>>1;
        }
        
        return cnt;
    }
}