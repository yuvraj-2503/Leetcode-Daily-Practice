class NumArray {
    int[] arr;
    int sum= 0;

    public NumArray(int[] nums) {
        arr = new int[nums.length];
        for(int i=0; i<nums.length; i++){
            arr[i] = nums[i];
            sum += arr[i];
        }
    }
    
    public void update(int i, int v) {
        sum = sum - arr[i] + v;
        arr[i] = v;
    }
    
    public int sumRange(int left, int right) {
        int i=0;
        int p= sum;
        while(i<left){
            p -= arr[i];
            i++;
        }
        
        i= arr.length-1;
        while(i>right){
            p -= arr[i];
            i--;
        }
        
        return p;
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * obj.update(index,val);
 * int param_2 = obj.sumRange(left,right);
 */