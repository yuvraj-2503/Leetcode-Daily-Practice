class Solution {
    public int[][] merge(int[][] arr) {
        Arrays.sort(arr, (a, b) -> {
           return a[0] - b[0]; 
        });
        
        ArrayList<int[]> lst = new ArrayList<>();
        for(int i=0; i<arr.length; i++){
            if(lst.isEmpty() || lst.get(lst.size() - 1)[1] < arr[i][0]){
                int[] x = { arr[i][0], arr[i][1] };
                
                lst.add(x);
            }else{
                int k = Math.max(lst.get(lst.size()-1)[1], arr[i][1] );
                lst.get(lst.size()-1)[1] = k;
            }
        }
        
        int[][] ans = new int[lst.size()][2];
        
        int idx=0;
        for(int[] x: lst){
            ans[idx++] = x;
        }
        
        return ans;
    }
}