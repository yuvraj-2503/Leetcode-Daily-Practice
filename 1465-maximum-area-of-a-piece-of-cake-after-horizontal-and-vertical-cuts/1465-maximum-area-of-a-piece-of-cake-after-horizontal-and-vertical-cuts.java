import java.util.Arrays;

public class Solution {
    public int maxArea(int h, int w, int[] horizontalCuts, int[] verticalCuts) {
        Arrays.sort(horizontalCuts);
        Arrays.sort(verticalCuts);
        int max_h= Math.max(horizontalCuts[0],h-horizontalCuts[horizontalCuts.length-1]);
        for (int i=0;i<horizontalCuts.length-1;i++){
            int curr_dif= horizontalCuts[i+1]-horizontalCuts[i];
            max_h= Math.max(max_h, curr_dif);
        }
        int max_w=Math.max(verticalCuts[0], w- verticalCuts[verticalCuts.length-1]);
        for (int i=0;i<verticalCuts.length-1;i++){
            int curr_dif= verticalCuts[i+1]- verticalCuts[i];
            max_w= Math.max(max_w, curr_dif);
        }
        return (int) (((long) max_h *max_w) %1000000007);
    }
}