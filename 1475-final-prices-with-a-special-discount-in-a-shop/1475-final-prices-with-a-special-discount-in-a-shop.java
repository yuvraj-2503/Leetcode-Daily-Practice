class Solution {
    public int[] finalPrices(int[] prices) {
        int n= prices.length;
        for(int i=0; i<prices.length; i++){
            int x=-1;
            for(int j= i+1; j<n; j++){
                if(prices[i] >= prices[j]){
                    x= j;
                    break;
                }
            }
            if(x==-1){
                continue;
            }
            
            prices[i] -= prices[x];
        }
        
        return prices;
    }
}