/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public int deepestLeavesSum(TreeNode root) {
        ArrayList<int[]> arr= new ArrayList<>();
        int cnt=0;
        dfs(root, cnt, arr);
        Collections.sort(arr, (a,b)-> {
            return a[0]-b[0];
        });
        // for(int[] x: arr){
        //     System.out.print(x[0]+ " ");
        //     System.out.println(x[1]);
        // }
        int sum=0;
        for(int i=arr.size()-1;i>=0;i--){
            if(arr.get(i)[0]==arr.get(arr.size()-1)[0]){
                sum += arr.get(i)[1];
            }
        }
        
        return sum;
    }
    
    void dfs(TreeNode root, int cnt, ArrayList<int[]> arr){
        if(root==null){
            return;
        }
        
        if(root.left==null && root.right==null){
            arr.add(new int[]{cnt, root.val});
            return;
        }
        
        dfs(root.left, cnt+1, arr);
        dfs(root.right, cnt+1, arr);
    }
}