class Solution {
    public int heightChecker(int[] h) {
        int[] e= Arrays.copyOf(h, h.length);
        Arrays.sort(e);
        int ans= 0;
        for(int i=0; i<e.length; i++){
            if(e[i] != h[i]){
                ans++;
            }
        }
        
        return ans;
    }
}