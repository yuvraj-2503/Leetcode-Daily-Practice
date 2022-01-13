class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n= nums.length;
        HashMap<Integer, Integer> mp= new HashMap<>();
        int[] ans= new int[2];
        for(int i=0;i<n;i++){
            if(mp.containsKey(target-nums[i])){
                ans[0]= i;
                ans[1] = mp.get(target-nums[i]);
            }
            mp.put(nums[i], i);
        }
        return ans;
    }
}