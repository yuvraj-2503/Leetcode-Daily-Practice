class Solution {
    public int minPartitions(String n) {
        int max=-1;
        for(int i=0;i<n.length();i++){
            int num = Character.getNumericValue(n.charAt(i));
            if(num>max)
                max=num;
        }
        return max;
    }
}