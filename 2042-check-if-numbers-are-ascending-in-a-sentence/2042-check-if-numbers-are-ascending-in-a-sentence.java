class Solution {
    public boolean areNumbersAscending(String s) {
        ArrayList<Integer> arr= new ArrayList<>();
        String[] sarr = s.split(" ");
        for(String x: sarr){
            int k=-1;
            try{
                k= Integer.parseInt(x);
            }catch(Exception e){
                k = -1;
            }
            if(k!=-1){
                arr.add(k);
            }
        }
        
        // for(int x: arr){
        //     System.out.print(x+ " ");
        // }
        // System.out.println();
        
        
        
        for(int i=0;i< arr.size()-1;i++){
            if(arr.get(i) >= arr.get(i+1)){
                return false;
            }
        }
        
        return true;
    }
}