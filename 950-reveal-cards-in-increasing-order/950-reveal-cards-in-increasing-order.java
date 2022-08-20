class Solution {
    public int[] deckRevealedIncreasing(int[] deck) {
        Queue<Integer> q = new LinkedList<>();
        Arrays.sort(deck);
        int n= deck.length;
        for(int i=0; i<n; i++){
            q.offer(i);
        }
        
        int[] ans = new int[n];
        
        for(int i=0; i<n; i++){
            ans[q.poll()] = deck[i];
            q.offer(q.poll());
        }
        
        return ans;
    }
}