class Solution {
    public int nearestValidPoint(int x, int y, int[][] points) {
        int d=Integer.MAX_VALUE;
        for (int i=0;i<points.length;i++){
            if (x==points[i][0] || y==points[i][1]){
                d= Math.min(d,Math.abs(x-points[i][0])+Math.abs(y-points[i][1]));
            }
        }
        int k=points.length;
        for (int i=0;i<points.length;i++){
            if (x==points[i][0] || y==points[i][1]){
                if (d==Math.abs(x-points[i][0])+Math.abs(y-points[i][1]))
                    k = Math.min(k,i);
            }
        }
        if (k==points.length)
            return -1;
        
        return k;
    }
}