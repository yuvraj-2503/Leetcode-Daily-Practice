class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        Arrays.sort(arr);
        int n= arr.length;
        int mn= arr[n-1] - arr[0];
        for(int i=0; i<n-1; i++){
            mn = Math.min(mn, arr[i+1] - arr[i]);
        }
        
        List<List<Integer>> ans = new ArrayList<>();
        for(int i=0; i<n-1; i++){
            if(arr[i+1] - arr[i] == mn){
                ArrayList<Integer> x= new ArrayList<>();
                x.add(arr[i]);
                x.add(arr[i+1]);
                ans.add(x);
            }
        }
        
        return ans;
        
        
    }
}