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
    public TreeNode insertIntoBST(TreeNode root, int key) {
        TreeNode prev = null, ptr = new TreeNode(key);
        
        if(root==null){
            return ptr;
        }
        
        TreeNode tmp = root;
        while(root != null){
            prev = root;
            
            if(root.val == key){
                return tmp;
            }else if(root.val > key){
                root  = root.left;
            }else root = root.right;
        }
        
        
        if(prev.val > key){
            prev.left = ptr;
        }else{
            prev.right = ptr;
        }
        
        return tmp;
        
    }
}