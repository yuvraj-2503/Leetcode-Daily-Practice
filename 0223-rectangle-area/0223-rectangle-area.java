class Solution {
    public int computeArea(int A, int B, int C, int D, int E, int F, int G, int H) {
        int area1 = (C-A) * (D-B);
        int area2 = (G-E) * (H-F);
        int overlapped = Math.max((Math.min(C,G) - Math.max(A,E)), 0) * 
            Math.max((Math.min(D,H) - Math.max(B,F)), 0);
        return area1+ area2 - overlapped;
    }
}