class Solution {
    public int romanToInt(String s) {
        int ans=0;
        int i=0;
        while (i<s.length()){
            if (i != s.length()-1){
                char c1=s.charAt(i);
                char c2=s.charAt(i+1);
                boolean special=true;
                if (c1=='I' && c2=='V'){
                    ans=ans+4;
                }else if (c1=='I' && c2=='X'){
                    ans+=9;
                }else if (c1=='X' && c2=='L'){
                    ans+=40;
                }else if (c1=='X' && c2=='C'){
                    ans+=90;
                }else if (c1=='C' && c2=='D'){
                    ans+=400;
                }else if (c1=='C' && c2=='M'){
                    ans+=900;
                }else {
                    special=false;
                }
                if (special){
                    i+=2;
                    continue;
                }
            }
            char c=s.charAt(i);
            switch (c){
                case 'I':
                    ans+=1;
                    break;
                case 'V':
                    ans+=5;
                    break;
                case 'X':
                    ans+=10;
                    break;
                case 'L':
                    ans+=50;
                    break;
                case 'C':
                    ans+=100;
                    break;
                case 'D':
                    ans+=500;
                    break;
                case 'M':
                    ans+=1000;
                    break;
            }
            i++;
        }
        return ans;
    }
}