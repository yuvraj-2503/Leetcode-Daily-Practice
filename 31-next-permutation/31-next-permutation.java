class Solution {
    public void nextPermutation(int[] arr) {
        int n= arr.length;
        
        int x= -1, y= -1;
        for(int i=n-2;i>=0;i--){
            if(arr[i] < arr[i+1]) {
                x= i;
                break;
            }
        }
        
        if(x==-1){
            rev(arr, 0, n-1);
            return;
        }
        
        for(int i=n-1;i>=0;i--){
            if(arr[i] > arr[x]) {
                y= i;
                break;
            }
        }
        
        
        swap(arr, x, y);
        // x = x + 1;
        rev(arr, x+1, n-1);
        
        
       
    }
    
    void swap(int[] arr, int x, int y){
        int tmp= arr[x];
        arr[x] = arr[y];
        arr[y] = tmp;
    }
    
    void rev(int[] arr, int x, int y){
         while(x<y){
            swap(arr, x, y);
            
            x++; y--;
        }
    }
}