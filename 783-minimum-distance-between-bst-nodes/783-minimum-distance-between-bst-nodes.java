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
    public int minDiffInBST(TreeNode root) {
        inorder(root);
        return ans;
    }
    
    int ans = Integer.MAX_VALUE, prev = -1;
    void inorder(TreeNode root){
        if(root == null){
            return;
            
        }
        
        inorder(root.left);
        if(prev != -1){
            int dif = root.val - prev;
            ans = Math.min(Math.abs(dif), ans);
        }
        prev = root.val;
        inorder(root.right);
    }
    
    
}