class Solution {
    public boolean exist(char[][] board, String word) {
        int r= board.length, c= board[0].length;
        boolean[][] visited = new boolean[r][c];
        
        for(int i=0; i<r; i++){
            for(int j=0; j<c; j++){
                if(board[i][j] == word.charAt(0)){
                    if(dfs(board, word, visited, i, j, 0)){
                        return true;
                    }
                }
            }
        }
        
        return false;
    }
    
    boolean dfs(char[][] board, String word, boolean[][] visited, int i, int j, int idx){
        if(i<0 || j<0 || i>=board.length || j>=board[0].length){
            return false;
        }
        
        if(visited[i][j]) return false;
        
        if(board[i][j] != word.charAt(idx)){
            return false;
        }
        
        if(idx == word.length()-1) {
            return true;
        }
        
        visited[i][j] = true;
        
        if(dfs(board, word, visited, i+1, j, idx+1)){
            return true;
        }
        
        if(dfs(board, word, visited, i-1, j, idx+1)){
            return true;
        }
        
        if(dfs(board, word, visited, i, j+1, idx+1)){
            return true;
        }
        if(dfs(board, word, visited, i, j-1, idx+1)){
            return true;
        }
        
        visited[i][j] = false;
        return false;
    }
}