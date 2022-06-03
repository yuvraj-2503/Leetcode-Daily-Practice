class Solution {
    public double average(int[] salary) {
        int mx=0, mn= Integer.MAX_VALUE;
        for(int s: salary){
            mx= Math.max(mx, s);
            mn= Math.min(mn, s);
        }
        
       
        double sum=0;
        for(int s : salary){
            if(!(s==mn || s==mx)){
                sum += s;
            }
        }
        
        return sum / (salary.length-2);
    }
}