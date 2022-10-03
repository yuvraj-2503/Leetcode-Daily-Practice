class Solution {
    public int minCost(String colors, int[] neededTime) {
        char[] color = colors.toCharArray();
        int ans = 0;
        
        for(int i=0; i<color.length-1; i++){
            if(color[i] == color[i+1]){
                ans += Math.min(neededTime[i], neededTime[i+1]);
                neededTime[i+1] = Math.max(neededTime[i], neededTime[i+1]);
            }
        }
        return ans;
    }
}