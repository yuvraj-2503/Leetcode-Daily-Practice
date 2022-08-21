class Solution {
    public int maxCoins(int[] piles) {
        Arrays.sort(piles);
        
        int ans =0;
        int n= piles.length;
        int i=0, j= n-1;
        while(i<j){
            j--;
        
            ans += piles[j];
            j--;
            i++;
        }
        
        return ans;
    }
}