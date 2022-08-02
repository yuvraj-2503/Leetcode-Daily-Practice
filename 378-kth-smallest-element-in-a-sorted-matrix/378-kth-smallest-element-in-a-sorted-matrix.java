class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        int x=0;
        int n= matrix.length;
        int[] arr= new int[n*n];
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                arr[x] = matrix[i][j];
                x++;
            }
        }
        Arrays.sort(arr);
        
        return arr[k-1];
    }
}