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
    
    boolean flag = false;
    int sum =0;
    public boolean hasPathSum(TreeNode root, int targetSum) {
        dfs(root, targetSum);
        return flag;
    }
    
    void dfs(TreeNode root, int target){
        if(root == null){
            return;
        }
        sum += root.val; 
        if(root.left == null && root.right == null){
            if(sum == target) flag = true;
        }
        dfs(root.left, target);
        dfs(root.right, target);
        sum -= root.val;
    }
}