class Solution {
    public List<Integer> luckyNumbers (int[][] matrix) {
        int m= matrix.length;
        int n= matrix[0].length;
        
        int[] row = new int[m];
        int[] col= new int[n];
        for(int i=0; i<m; i++){
            row[i] = matrix[i][0];
            for(int j=0; j<n; j++){
                if(matrix[i][j] < row[i]) row[i] = matrix[i][j];
                
                if(matrix[i][j] > col[j]) col[j] = matrix[i][j];
            }
        }
        
        ArrayList<Integer> ans= new ArrayList<>();
        
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                if(row[i] == col[j]) {
                    ans.add(row[i]);
                }
                
            }
        }
        
        return ans;
    }
}