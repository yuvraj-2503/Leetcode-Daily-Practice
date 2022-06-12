class Solution {
    public int maximumUniqueSubarray(int[] nums) {
        int i=0, j=1;
        int n= nums.length;
        HashSet<Integer> s= new HashSet<>();
        
        int currSum = nums[0];
        int maxSum = currSum;
        
        s.add(nums[0]);
        
        while(i<n-1 && j<n){
            if(!s.contains(nums[j])){
                currSum += nums[j];
                maxSum = Math.max(maxSum, currSum);
                
                s.add(nums[j++]);
            }else{
                currSum -= nums[i];
                s.remove(nums[i++]);
            }
        }
        
        return maxSum;
    }
}