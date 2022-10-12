class Solution {
    public int largestPerimeter(int[] nums) {
        Arrays.sort(nums);
        int n= nums.length;
        int i= n-3;
        int j= n-2;
        int k= n-1;
        while(i>0 && nums[i]+nums[j]<=nums[k]){
            i--;
            j--;
            k--;
        }
        
        if(nums[i]+nums[j]>nums[k]){
            return nums[i]+nums[j]+nums[k];
        }
        
        return 0;
    }
}