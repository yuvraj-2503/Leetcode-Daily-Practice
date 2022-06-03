class Solution {
    public int numIslands(char[][] grid) {
        int m= grid.length;
        int n= grid[0].length;
        boolean[][] vis= new boolean[m][n];
        int ans=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]=='1' && !vis[i][j]){
                    dfs(grid, vis, i, j, m, n);
                    ans++;
                }
            }
        }
        
        return ans;
    }
    
    void dfs(char[][] grid, boolean[][] vis, int i, int j, int rows, int cols){
        if(i<0 || i>=rows || j<0 || j>=cols){
            return;
        }
        
        if(grid[i][j]=='0'){
            return;
        }
        
        if(vis[i][j]){
            return;
        }
        
        vis[i][j] = true;
        
        dfs(grid, vis, i+1, j, rows, cols);
        dfs(grid, vis, i-1, j, rows, cols);
        dfs(grid, vis, i, j-1, rows, cols);
        dfs(grid, vis, i, j+1, rows, cols);
        
        
    }
    
}