class Solution {
    public String sortSentence(String s) {
        String[] arr= s.split(" ");
        HashMap<Integer, String> mp= new HashMap<>();
        for(String x: arr){
            int ind = Integer.parseInt(String.valueOf(x.charAt(x.length() - 1)));
            String x1 = x.substring(0, x.length()-1);
            mp.put(ind, x1);
        }
        
        String ans = "";
        for(int x: mp.keySet()){
            ans += mp.get(x);
            ans += " ";
        }
        
        ans = ans.trim();
        
        return ans;
    }
}