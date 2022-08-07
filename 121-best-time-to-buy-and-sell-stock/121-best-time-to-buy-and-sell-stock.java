class Solution {
    public int maxProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE;
        int max=0;
        for(int x: prices){
            minPrice = Math.min(x, minPrice);
            max = Math.max(max, x- minPrice);
        }
        
        return max;
    }
}