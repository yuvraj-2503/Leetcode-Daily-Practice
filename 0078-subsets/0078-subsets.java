class Solution {
    List<List<Integer>> ans;
    public List<List<Integer>> subsets(int[] nums) {
        ans= new ArrayList<>();
        List<Integer> arr= new ArrayList<>();
        subsets(nums, 0, arr);
        return ans;
    }
    
    void subsets(int[] nums, int idx, List<Integer> arr){
        if(idx == nums.length){
            ans.add(new ArrayList<>(arr));
            return;
        }
        arr.add(nums[idx]);
        subsets(nums, idx+1, arr);
        arr.remove(arr.size()-1);
        subsets(nums, idx+1, arr);
        
    }
}