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
    
    public boolean isValidBST(TreeNode root) {
        
        return check(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }
    
    boolean check(TreeNode root, long mn, long mx){
        if(root == null) {
            return true;
        }
        
        boolean f1 = check(root.left, mn, Math.min(mx, root.val));
        
        boolean f2 = check(root.right, Math.max(mn, root.val), mx);
        
        return (mn < root.val && root.val < mx) && f1 && f2;
        
    }
    
}