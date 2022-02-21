class Solution {
    public int minimumSum(int num) {
        int d= num %10;
        int[] arr= new int[4];
        arr[0]= d;
        d= (num/10)%10;
        arr[1]= d;
        d= (num/100)%10;
        arr[2]= d;
        d= (num/1000)%10;
        arr[3]= d;
        Arrays.sort(arr);
        int f= arr[0]*10 + arr[2];
        int s= arr[1]*10 + arr[3];
        return f+s;
    }
}