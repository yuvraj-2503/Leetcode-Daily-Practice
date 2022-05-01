class Solution {
    public boolean backspaceCompare(String s, String t) {
        Stack<Character> s1 = new Stack<>();
        Stack<Character> s2 = new Stack<>();
        for(char c: s.toCharArray()){
            if(c=='#'){
                if(!s1.isEmpty()){
                    s1.pop();
                }
                continue;
            }
            
            s1.push(c);
        }
        
        for(char c: t.toCharArray()){
            if(c=='#'){
                if(!s2.isEmpty()){
                    s2.pop();
                }
                continue;
            }
            
            s2.push(c);
        }
        
//         if(s1.size()!=s2.size()){
//             return false;
//         }
        
        // if(s1.size()==0 && s2.size()==0){
        //     return true;
        // }
        
        String r1= "";
        String r2 = "";
        
        while(s1.size()>0){
            r1 += s1.pop();
        }
        while(s2.size()>0){
            r2 += s2.pop();
        }
        
        return r1.equals(r2);
        
    }
}