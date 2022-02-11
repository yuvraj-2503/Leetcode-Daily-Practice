class Solution {
    public int findCenter(int[][] edges) {
        HashSet<Integer> s= new HashSet<>();
        s.add(edges[0][0]);
        s.add(edges[0][1]);
        if(!s.add(edges[1][0])){
            return edges[1][0];
        }
        if(!s.add(edges[1][1])){
            return edges[1][1];
        }
        
        return 0;
    }
}