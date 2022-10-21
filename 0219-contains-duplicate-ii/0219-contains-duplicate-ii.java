import java.util.HashMap;

class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        int n= nums.length;
        HashMap<Integer, Integer> mp= new HashMap<>();
        for(int i=0;i<n;i++){
            if(mp.containsKey(nums[i]) && Math.abs(mp.get(nums[i]) - i)<=k){
                return true;
            }
            else{
                mp.put(nums[i], i);
            }
        }
        return false;
    }
}