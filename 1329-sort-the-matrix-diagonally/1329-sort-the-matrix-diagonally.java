class Solution {
    public int[][] diagonalSort(int[][] mat) {
        int m= mat.length;
        int n= mat[0].length;
        
        // row=0
        for(int col=0;col<n;col++){
            sort(mat, 0, col, m, n);
        }
        
        // col=0
        for(int row=1;row<m;row++){
            sort(mat, row, 0, m, n);
        }
        
        return mat;
    }
    
    void sort(int[][] mat, int row, int col, int m, int n){
        List<Integer> arr= new ArrayList<>();
        int r= row;
        int c= col;
        while(r<m && c<n){
            arr.add(mat[r][c]);
            r++;
            c++;
        }
        
        Collections.sort(arr);
        
        r= row;
        c= col;
        int idx=0;
        while(r<m && c<n){
            mat[r][c] = arr.get(idx++);
            r++;
            c++;
        }
    }
}