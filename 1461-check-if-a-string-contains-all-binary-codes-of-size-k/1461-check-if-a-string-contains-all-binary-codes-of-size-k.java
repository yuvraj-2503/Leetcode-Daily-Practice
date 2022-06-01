class Solution {
        public boolean hasAllCodes(String s, int k) {
            HashSet<String> st= new HashSet<>();
            StringBuffer s1= new StringBuffer();
            
            if(k> s.length()){
                return false;
            }
            
            
            for(int i=0;i<k;i++){
                s1.append(s.charAt(i));
            }

            st.add(s1.toString());
            int i=0, j= s.length()-1;
            int p= k;
            while(k<=j){
                s1.deleteCharAt(i);
                s1.append(s.charAt(k));
                k++;
                st.add(s1.toString());
            }

            return Math.pow(2, p) == st.size();

        }
    }