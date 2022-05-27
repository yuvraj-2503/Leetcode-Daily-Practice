class Solution {
    public List<List<Integer>> generate(int n) {
        List<List<Integer>> ans = new ArrayList<>();
        ArrayList<Integer> f= new ArrayList<>();
        f.add(1);
        ans.add(f);
        for(int i=1;i<n;i++){
            List<Integer> row = new ArrayList<>();
            row.add(1);
            
            List<Integer> prev = ans.get(i-1);
            for(int j=1;j<i;j++){
                row.add(prev.get(j) + prev.get(j-1));
            }
            
            row.add(1);
            ans.add(row);
        }
        
        return ans;
    }
}