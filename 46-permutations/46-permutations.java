class Solution {
    List<List<Integer>> result;
    public List<List<Integer>> permute(int[] nums) {
        result = new ArrayList<>();
        
        ArrayList<Integer> arr= new ArrayList<>();
        ArrayList<Integer> ans= new ArrayList<>();
        for(int x: nums){
            arr.add(x);
        }

        permute(arr, ans);
        
        return result;
    }
    
    void permute(List<Integer> arr, ArrayList<Integer> ans){
        if(arr.size()==0){
            System.out.println(ans);
            result.add(new ArrayList<>(ans));
            return;
        }
        for(int i=0; i< arr.size(); i++){
            int curr = arr.get(i);
            arr.remove(i);
            ans.add(curr);
            permute(arr, ans);
            arr.add(i, curr);
            ans.remove(ans.size()-1);
        }
    }
}