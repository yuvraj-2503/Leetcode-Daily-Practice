class Solution {
    public int findDuplicate(int[] nums) {
        int n= nums.length;
        HashSet<Integer> s= new HashSet<>();
        for(int x: nums){
            if(!s.add(x)){
                return x;
            }
            
            s.add(x);
        }
        
        
        return 0;
    }
}