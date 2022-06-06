class Solution {
    public int arraySign(int[] nums) {
        int negCount = 0;
        for(int x: nums){
            if(x==0){
                return 0;
            }
            
            if(x<0) negCount++;
        }
        
        if(negCount % 2==0){
            return 1;
        }else
            return -1;
        
    }
}