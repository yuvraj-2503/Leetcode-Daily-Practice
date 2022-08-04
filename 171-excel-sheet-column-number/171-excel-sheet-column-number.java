class Solution {
    public int titleToNumber(String columnTitle) {
        int ans =0;
        for(int i=0; i<columnTitle.length(); i++){
            ans *= 26;
            int n= columnTitle.charAt(i) - 'A' + 1;
            ans += n;
        }
        
        return ans;
    }
}