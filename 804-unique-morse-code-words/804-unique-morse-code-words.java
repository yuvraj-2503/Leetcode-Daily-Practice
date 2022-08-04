class Solution {
    public int uniqueMorseRepresentations(String[] words) {
        String[] morse = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        
        HashSet<String> st= new HashSet<>();
        for(String w: words){
            String x = "";
            for(char c: w.toCharArray()){
                int d = (int)c - 'a';
                x += morse[d];
                
            }
            st.add(x);
            
        }
        
        // System.out.println(st);
        
        return st.size();
    }
}