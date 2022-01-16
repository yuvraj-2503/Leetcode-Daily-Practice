import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans= new ArrayList<>();
        List<Integer> row= new ArrayList<>();
        row.add(1);
        ans.add(row);
        for(int i=1;i<numRows;i++){
            List<Integer> prevRow;
            prevRow= ans.get(i-1);
            List<Integer> currRow= new ArrayList<>();
            currRow.add(1);
            for(int j=1;j< i;j++){
                currRow.add(prevRow.get(j)+prevRow.get(j-1));
            }
            currRow.add(1);
            ans.add(currRow);
        }
        return ans;
    }
}