class Solution {
    public int maxSubArray(int[] nums) {
        int []sum = new int[nums.length];
        int add=0;
        for(int i=0;i<nums.length;i++)
        {
            add+=nums[i];
            sum[i]=add;
        }
        int min=0;
        int max=sum[0];
        for(int i =0; i<sum.length; i++)
        {
            
            if(sum[i]-min> max){
                max=sum[i]-min;
            }
            if(sum[i]<min){
                min=sum[i];
            }
        }
       return max; 
    }
}