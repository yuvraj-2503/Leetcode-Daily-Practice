class Solution {
    public int numberOfWeakCharacters(int[][] arr) {
        Arrays.sort(arr, (a, b) -> {
           return (a[0] == b[0]) ? b[1] - a[1] : a[0] - b[0];
        });
        
        for(int[] x: arr){
            System.out.println(x[0] + " "+ x[1]);
        }
        
        int n = arr.length;
        int max = arr[n-1][1];
        
        int ans = 0;
        for(int i = n-2; i>=0; i--){
            if(arr[i][1] < max){
                ans++;
            }else{
                max = arr[i][1];
            }
        }
        
        return ans;
    }
}