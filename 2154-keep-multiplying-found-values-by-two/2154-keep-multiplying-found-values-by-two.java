class Solution {
    public int findFinalValue(int[] nums, int x) {
        while(search(nums, x)){
            x *= 2;
        }
        
        return x;
    }
    
    boolean search(int[] nums, int x){
        int n= nums.length;
        for(int i=0; i<n; i++){
            if(nums[i] == x){
                return true;
            }
        }
        
        return false;
    }
}