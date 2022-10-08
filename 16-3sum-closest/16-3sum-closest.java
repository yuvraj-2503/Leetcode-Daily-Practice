class Solution {
    public int threeSumClosest(int[] nums, int t) {
        int n= nums.length;
        int mn= Integer.MAX_VALUE;
        Arrays.sort(nums);
        int ans = 0;
        for(int i=0; i<n; i++){
            int j=i+1, k=n-1;
            while(j<k){
                int s= nums[i] + nums[j] + nums[k];
                int d= Math.abs(s-t);
                if(d<mn){
                    mn= d;
                    ans = s;
                }
                
                if(s>t) k--;
                else j++;
            }
        }
        return ans;
    }
}