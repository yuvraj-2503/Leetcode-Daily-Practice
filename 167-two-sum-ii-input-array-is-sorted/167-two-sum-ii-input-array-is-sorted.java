class Solution {
    public int[] twoSum(int[] arr, int target) {
       int n= arr.length;
        int i=0, j=n-1;
        int[] ans= new int[2];
        while(i<j){
            if(arr[i]+arr[j]<target){
                i++;
            }else if(arr[i]+arr[j]>target){
                j--;
            }else{
                break;
            }
        }
        ans[0] = i+1;
        ans[1] = j+1;
        return ans;
    }
    
}