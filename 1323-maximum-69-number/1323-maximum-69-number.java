class Solution {
    public int maximum69Number (int num) {
        String n= String.valueOf(num);
        String ans = "";
        boolean flag = true;
        for(int i=0; i<n.length(); i++){
            char c= n.charAt(i);
            if(c=='6'){
                if(flag){
                    ans += '9';
                    flag = false;
                }
                else
                    ans += '6';
            }else{
                ans += '9';
            }
        }
        
        return Integer.parseInt(ans);
    }
}