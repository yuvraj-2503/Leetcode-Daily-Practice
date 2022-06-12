class Solution {
    public int numSpecial(int[][] mat) {
        int m= mat.length, n = mat[0].length;
        int ans=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(mat[i][j]==1){
                    int row = i, col = j;
                    boolean f1= true, f2= true;
                    for(int k=0;k<n;k++){
                        if(mat[row][k]==1 && k!=col){
                            f1 = false;
                        }
                    }
                    
                    for(int k=0;k<m;k++){
                        if(mat[k][col]==1 && k!=row){
                            f2 = false;
                        }
                    }
                    
                    if(f1 && f2){
                        ans++;
                    }
                }
            }
        }
        
        return ans;
    }
}