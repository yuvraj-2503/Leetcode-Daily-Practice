class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int l = m + n; n--; m--;
        
        while(--l >= 0)
            nums1[l] = n < 0 || (m >= 0 && nums1[m] > nums2[n])?nums1[m--]:nums2[n--];
    }
}