class Solution {
    public int minDeletionSize(String[] strs) {
        int ans=0;
        for(int i=0; i< strs[0].length(); i++){
            for(int j=0; j<strs.length - 1; j++){
                char c1= strs[j].charAt(i);
                char c2= strs[j+1].charAt(i);
                if(c1> c2){
                    ans++; break;
                }
            }
        }
        
        return ans;
    }
}