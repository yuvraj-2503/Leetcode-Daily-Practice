class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int[] ans= new int[nums.length];
        int j=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]%2==0){
                ans[j] = nums[i];
                j++;
            }
        }
        
        for(int i=0;i<nums.length;i++){
            if(nums[i]%2==1){
                ans[j] = nums[i];
                j++;
            }
        }
        
        return ans;
    }
}