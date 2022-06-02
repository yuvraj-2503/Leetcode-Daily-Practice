class Solution {
    public List<Integer> intersection(int[][] nums) {
        HashMap<Integer, Integer> mp= new HashMap<>();
        for(int[] x: nums){
            for(int y: x){
                mp.put(y ,mp.getOrDefault(y, 0) + 1);
            }
        }
        List<Integer> ans= new ArrayList<>();
        
        for(int x: mp.keySet()){
            if(mp.get(x)==nums.length){
                ans.add(x);
            }
        }
        Collections.sort(ans);
        return ans;
    }
}