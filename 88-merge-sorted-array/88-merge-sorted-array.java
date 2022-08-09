class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        
        if(nums2.length==0){
            return;
        }
        for(int i=0; i<m; i++){
            if(nums1[i] > nums2[0]){
                int tmp = nums1[i];
                nums1[i] = nums2[0];
                nums2[0] = tmp;
                
                Arrays.sort(nums2);
            }
        }
        
        for(int i=0; i<n; i++){
            nums1[i+m] = nums2[i];
        }
    }
}