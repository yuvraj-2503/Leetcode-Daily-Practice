class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> list = new ArrayList<>();
		//loop every element
        for(int i=0;i<nums.length;i++) {
			//start element
            int start=nums[i];
			//iterate till current element +1 equals next element
            while(i<nums.length-1 && nums[i]+1==nums[i+1]) {
                i++;
            }
			//add only start, if above loop condition does not met
            if(start==nums[i]) {
                list.add(String.valueOf(start));
            } else {
				//else it means answer exists and add start+"->"+nums[i] to answer
                list.add(start+"->"+nums[i]);                            
            }
        }
		//return list of intervals
        return list;
    }
}