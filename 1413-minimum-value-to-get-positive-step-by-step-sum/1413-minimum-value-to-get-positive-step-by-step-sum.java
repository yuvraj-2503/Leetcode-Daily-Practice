class Solution {
    public int minStartValue(int[] nums) {
        int n= nums.length;
        int sum=0;
        int ans = 0;
        for(int i=0; i<n; i++){
            sum += nums[i];
            if(sum <=0){
                // int dif = 1 - sum;
                ans = Math.min(ans, sum);
            }
            
        }
        
        return 1-ans;
    }
}