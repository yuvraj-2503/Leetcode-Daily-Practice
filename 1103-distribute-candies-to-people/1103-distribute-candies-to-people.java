class Solution {
    public int[] distributeCandies(int candies, int n) {
        int[] ans = new int[n];
        int i= 0;
        while(candies > 0){
            if(candies>= i+1){
                ans[i % n] += (i+1);
                candies -= (i+1);
            }else{
                ans[i % n] += candies;
                candies =0;
            }
            
            i++;
            
        }
        
        return ans;
    }
}