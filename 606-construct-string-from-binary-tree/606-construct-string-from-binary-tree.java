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
    public String tree2str(TreeNode root) {
        sb= new StringBuffer();
        util(root);
        return sb.toString();
    }
    
    StringBuffer sb;
    
    void util(TreeNode root){
        if(root == null){
            return;
        }
        
        if(root.left == null && root.right == null){
            sb.append(root.val);
            return;
        }
        
        sb.append(root.val);
        // if(root.left != null){
            sb.append('(');
            util(root.left);
            sb.append(')');
        // }
        
        if(root.right != null){
            sb.append('(');
            util(root.right);
            sb.append(')');
        }
        
    }
}