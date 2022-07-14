class Solution {
    public int minMovesToSeat(int[] seats, int[] students) {
        Arrays.sort(seats);
        int n= seats.length;
        Arrays.sort(students);
        int ans =0;
        for(int i=0; i<n ;i++){
            ans += Math.abs(students[i] - seats[i]);
        }
        
        return ans;
    }
}