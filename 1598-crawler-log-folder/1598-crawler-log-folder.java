class Solution {
    public int minOperations(String[] logs) {
        int step=0;
        for(String x: logs){
            if(x.equals("../")){
                step = Math.max(step-1, 0);
            }else if(!x.equals("./")){
                step++;
            }
        }
        
        return step;
    }
}