import java.util.Stack;

class Solution {
    public boolean isValid(String str) {
        Stack<Character> st= new Stack<>();
        char[] s= str.toCharArray();
        for (char c : s) {
            if (c == '(' || c == '{' || c == '[') {
                st.push(c);
            } else {
                if (st.empty()) {
                    return false;
                } else if (st.peek() == invertChar(c)) {
                    st.pop();
                } else {
                    return false;
                }
            }
        }
        return st.size() <= 0;
    }

    char invertChar(char c){
        if(c==')')
            return '(';
        else if (c=='}')
            return '{';
        else
            return '[';
    }
}