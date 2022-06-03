class Solution {
    public int triangularSum(int[] nums) {
        int n= nums.length;
        int m=n;
        
        
        for(int i=0;i<m;i++){
            if(n==1){
                return nums[0];
            }
            int[] a= new int[n-1];
            for(int j=0;j<n-1;j++){
                a[j]= (nums[j] + nums[j+1])%10;
            }
            nums = new int[n-1];
            for(int j=0;j<n-1;j++){
                nums[j] = a[j];
            }
            
            n= n-1;
        }
        
        return nums[0];
    }
}