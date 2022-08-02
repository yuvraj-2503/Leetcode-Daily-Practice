class Solution {
    public List<Integer> minSubsequence(int[] nums) {
        Arrays.sort(nums);
        int sum=0, curr=0;;
        for(int i=0; i<nums.length; i++){
            sum += nums[i];
        }
        ArrayList<Integer> ans= new ArrayList<>();
        for(int i=nums.length-1; i>=0; i--){
            sum -= nums[i];
            curr += nums[i];
            ans.add(nums[i]);
            if(curr > sum){
                return ans;
            }
        }
        
        return ans;
    }
}