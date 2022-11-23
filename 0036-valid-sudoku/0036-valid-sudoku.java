import java.util.HashSet;

class Solution {
    public boolean isValidSudoku(char[][] board) {
        int m= 9;
        int n= 9;
        for(int i=0;i<m;i++){
            HashSet<Character> rowSet= new HashSet<>();
            HashSet<Character> colSet= new HashSet<>();
            HashSet<Character> cubeSet= new HashSet<>();
            for(int j=0;j<n;j++){
                if(board[i][j]!='.' && !rowSet.add(board[i][j])){
                    return false;
                }

                else if(board[j][i]!='.' && !colSet.add(board[j][i])){
                    return false;
                }
                else{
                    int r = (3 * (i/3)) + (j/3);
                    int c = (3 * (i%3)) + (j%3);
                    if(board[r][c]!='.'  && !cubeSet.add(board[r][c])){
                        return false;
                    }
                }
            }
        }
        return true;
    }
}