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
    public int maxLevelSum(TreeNode root) {
        if(root == null) return 0;
        
        
        int max = Integer.MIN_VALUE;
        Queue<TreeNode> q = new LinkedList<>();
        
        q.add(root);
        int level = 0, maxLevel = 0;

        while(!q.isEmpty()){
            int sz = q.size();
            int sum = 0;
            while(sz-->0){
                TreeNode curr = q.poll();
                
                sum += curr.val;
                if(curr.left != null) q.add(curr.left);
                if(curr.right != null) q.add(curr.right);
                
            }
            
            level++;
            
            if(sum > max){
                max = sum;
                maxLevel = level;
                
            }
            
            // max = Math.max(max, sum);
        }
        
        return maxLevel;
    }
}