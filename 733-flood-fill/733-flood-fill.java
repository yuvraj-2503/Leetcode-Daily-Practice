class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        
        
        if(newColor==image[sr][sc]){
            return image;
        }
        
        int src= image[sr][sc];
        
        dfs(image, sr, sc, src, image.length, image[0].length, newColor);
        return image;
    }
    
    void dfs(int[][] matrix, int sr, int sc, int source, int rows, int cols, int newColor){
        
        if(sr<0 || sr>=rows || sc<0 || sc>=cols){
            return;
        }
        if(matrix[sr][sc] != source){
            return;
        }
        
        matrix[sr][sc] = newColor;
        dfs(matrix, sr+1, sc, source, rows, cols, newColor);
        dfs(matrix, sr-1, sc, source, rows, cols, newColor);
        dfs(matrix, sr, sc+1, source, rows, cols, newColor);
        dfs(matrix, sr, sc-1, source, rows, cols, newColor);
        
    }
}