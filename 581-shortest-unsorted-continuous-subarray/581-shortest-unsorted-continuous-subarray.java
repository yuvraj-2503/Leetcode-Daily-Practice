class Solution {
    public int findUnsortedSubarray(int[] nums) {
        int[] arr= new int[nums.length];
        for(int i=0;i<nums.length;i++){
            arr[i] = nums[i];
        }
        
        Arrays.sort(nums);
        int fI=-1, sI=-1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=arr[i]){
                fI = i;
                break;
            }
        }
        
        for(int i=nums.length-1;i>=0;i--){
            if(nums[i]!=arr[i]){
                sI = i;
                break;
            }
        }
        
        int ans=0;
        if(fI != sI){
            ans = sI - fI + 1;
        }
        
        return ans;
    }
}