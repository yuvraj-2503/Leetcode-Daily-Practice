class Solution {

    boolean[][] visited;
    public int maxAreaOfIsland(int[][] grid) {
        int m= grid.length;
        int n= grid[0].length;
        int max_area= 0;
        visited= new boolean[m][n];
        for (int i=0;i<m;i++){
            for (int j=0;j<n;j++){
                max_area= Math.max(max_area, area(i,j,grid));
            }
        }
        return max_area;
    }
    int area(int row, int col, int[][] grid){
        if (row<0 || row>= grid.length || col<0 || col>= grid[row].length ||grid[row][col]==0 || visited[row][col])
            return 0;

        visited[row][col] = true;
        return (1+ area(row-1,col,grid) + area(row,col-1,grid)
                + area(row+1, col, grid) + area(row,col+1, grid));
    }
}