class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> s= new HashSet<>();
        for(int i: nums){
            if(!s.add(i))
                return true;
            s.add(i);
        }
        return false;
    }
}