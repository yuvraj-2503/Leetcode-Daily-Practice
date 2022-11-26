class Solution {
    public class Job implements Comparable<Job>{
        int startTime;
        int endTime;
        int profit;
        Job(int startTime, int endTime, int profit){
            this.startTime = startTime;
            this.endTime = endTime;
            this.profit = profit;
        }
        public int compareTo(Job j){
            return this.endTime - j.endTime;
        }
    }
    public int jobScheduling(int[] startTime, int[] endTime, int[] profit) {
        List<Job> list = new ArrayList<>();
        for(int i=0; i<profit.length; i++){
            list.add(new Job(startTime[i], endTime[i], profit[i]));
        }
        Collections.sort(list);
        TreeMap<Integer, Integer> map = new TreeMap<>();
        int ans = -1;
        for( Job job : list ){
            Integer greatKey = map.floorKey(job.startTime); 
            int curProfit = greatKey==null ? 0 : map.get(greatKey);
            ans = Math.max(ans, curProfit+job.profit); 
            map.put(job.endTime, ans);
        }
        return ans;
    }
}