class Solution {
    public String reverseVowels(String s) {
        char[] arr= s.toCharArray();
        int left = 0, right = arr.length-1;
        
        while(left < right){
            while(left < right && !isVowel(arr[left])){
                left++;
                
            }
            
            while(left < right && !isVowel(arr[right])){
                right--;
                
            }
            
            char tmp = arr[left];
            arr[left] = arr[right];
            arr[right] = tmp;
            left++;
            right--;
            
            
        }
        
        return new String(arr);
    }
    
    boolean isVowel(char x){
        if(x=='a' || x=='e' ||  x=='i' || x=='o' || x=='u' ||
          x=='A' || x=='E' || x=='I' || x=='O' || x=='U'){
            return true;
        }
        
        return false;
    }
}