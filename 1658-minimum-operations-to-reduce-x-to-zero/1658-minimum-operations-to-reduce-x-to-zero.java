class Solution {
    public int minOperations(int[] nums, int x) {
        int n= nums.length;
        int sum=0;
        for(int i=0;i<n;i++){
            sum += nums[i];
        }
        
        int l=0, r=0;
        int currSum=0, maxLength= -1;
        for(l=0, r=0;r<n;r++){
            currSum += nums[r];
            while(l<=r && currSum > sum - x){
                currSum -= nums[l++];
            }
            
            if(currSum == sum-x) maxLength = Math.max(maxLength, r-l+1);
        }
        
        return maxLength == -1 ? -1 : n-maxLength;
    }
}