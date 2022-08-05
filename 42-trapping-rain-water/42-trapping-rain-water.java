class Solution {
    public int trap(int[] arr) {
        int n = arr.length;
	    int[] pre = new int[n];

        int[] suf = new int[n];
        pre[0] = arr[0];
        for(int i=1; i<n; i++){
            pre[i]= Math.max(pre[i-1], arr[i]);
        }
        suf[n-1]= arr[n-1];
        for(int i=n-2; i>=0; i--){
            suf[i]= Math.max(suf[i+1], arr[i]);
        }

        int ans =0;

        for(int i=1; i<n-1; i++){
            int k= Math.min(pre[i-1], suf[i+1]);
            int x = k-arr[i];
            if(x>=0){
                ans += x;
            }
        }
        return ans;
    }
}