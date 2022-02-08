class Solution {
    public int addDigits(int num) {
        String n= String.valueOf(num);
        if(n.length()==1){
            return Integer.parseInt(n);
        }
        int sum=0;
        for(int i=0;i<n.length();i++){
            sum += Integer.parseInt(String.valueOf(n.charAt(i)));
        }
        return Integer.parseInt(String.valueOf(addDigits(sum)));
    }
}