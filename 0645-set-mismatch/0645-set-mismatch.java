class Solution {
    public int[] findErrorNums(int[] nums) {
        int n= nums.length;
        HashSet<Integer> st= new HashSet<>(); 
        int[] ans= new int[2];
        int sum=0;
        for(int i=0; i<n; i++){
            if(st.contains(nums[i])){
                ans[0] = nums[i];
            }else{
                sum += nums[i];
            }
            
            st.add(nums[i]);
        }
        
        int req= n* (n+1)/2;
        
        ans[1] = req- sum;
        
        return ans;
    }
}