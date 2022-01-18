class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m= matrix.length;
        int n= matrix[0].length;
        if(m==0){
            return false;
        }
        int low=0, high= m*n-1;
        while(low<=high){
            int mid= (low + high)/2;
            
            int r= mid/n, c= mid%n;
            if(matrix[r][c]==target){
                return true;
            }else if(matrix[r][c]>target){
                high= mid-1;
            }else
                low= mid+1;
        }
        
        return false;
    }
}