class Solution {
    public boolean canMakeArithmeticProgression(int[] nums) {
        Arrays.sort(nums);
        boolean f= true;
        for(int i=0;i<nums.length-2;i++){
            if(nums[i+1]-nums[i]!=nums[i+2]-nums[i+1]){
                f= false;
            }
        }
        
        return f;
    }
}