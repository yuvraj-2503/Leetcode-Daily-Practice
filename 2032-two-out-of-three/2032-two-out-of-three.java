class Solution {
    public List<Integer> twoOutOfThree(int[] nums1, int[] nums2, int[] nums3) {
        int[] cnt1 = new int[101];
        int[] cnt2 = new int[101];
        int[] cnt3 = new int[101];
        for(int i=0; i<nums1.length; i++){
            cnt1[nums1[i]]++;
        }
        
        for(int i=0; i<nums2.length; i++){
            cnt2[nums2[i]]++;
        }
        
        for(int i=0; i<nums3.length; i++){
            cnt3[nums3[i]]++;
        }
        
        
        ArrayList<Integer> ans= new ArrayList<>();
        for(int i=1; i<= 100; i++){
           if(cnt1[i]>0 && cnt2[i] >0){
               ans.add(i);
           }else if(cnt2[i]>0 && cnt3[i] >0){
               ans.add(i);
           }else if(cnt3[i]>0 && cnt1[i] >0){
               ans.add(i);
           }
        }
        
        // System.out.println();
        
        return ans;
    }
}