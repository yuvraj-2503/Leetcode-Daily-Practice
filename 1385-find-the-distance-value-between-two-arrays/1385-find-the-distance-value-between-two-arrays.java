class Solution {
    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        Arrays.sort(arr2);
        int c=0;
        for(int i=0;i<arr1.length;i++){
            if(!binarySearch(arr1[i]-d, arr1[i]+d, arr2, arr2.length)){
                c++;
            }
            
        }
        
        return c;
    }
    
    
    boolean binarySearch(int r1, int r2, int[] arr, int n){
        int l=0, r= n-1;
        while(l<=r){
            int mid= l+ (r-l)/2;
            if(arr[mid]>=r1 && arr[mid]<=r2){
                return true;
            }else if(arr[mid]<r1){
                l = mid +1;
            }else{
                r = mid-1;
            }
        }
        
        return false;
    }
}