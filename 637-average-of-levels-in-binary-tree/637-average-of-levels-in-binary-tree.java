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
    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> ans = new ArrayList<>();
         Queue<TreeNode> queue = new LinkedList<>();
        
        if(root != null) queue.add(root);
        
        
        
        while(!queue.isEmpty()){
            int sz = queue.size();
            double sum =0;
            TreeNode tmp = null;
            for(int i=0; i<sz; i++){
                tmp = queue.poll();
                sum += tmp.val;
                if(tmp.left != null){
                    queue.add(tmp.left);
                }

                if(tmp.right != null){
                    queue.add(tmp.right);
                }
               
            }
            
            sum /= sz;
            
            ans.add(sum);
            
            
        }
        
        return ans;
        
    }
}