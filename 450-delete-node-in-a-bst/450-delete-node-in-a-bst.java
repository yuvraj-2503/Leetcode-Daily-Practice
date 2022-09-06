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
    public TreeNode deleteNode(TreeNode root, int key) {
        
        if(root == null) return null;
        
        if(root.left == null && root.right == null) {
            
            if(root.val != key){
                return root;
            }
            root = null;
            return root;
        }
        
        
        TreeNode iPre;
        if(key < root.val){
            root.left = deleteNode(root.left, key);
        }else if(key > root.val){
            root.right = deleteNode(root.right, key);
        }else{
            if(root.left != null && root.right != null){
                iPre = inOrderPredecessor(root);
            root.val = iPre.val;
            root.left = deleteNode(root.left, root.val);
            }else if(root.left != null){
                return root.left;
            }else{
                return root.right;
            }
        }
        
        return root;
    }
    
    TreeNode inOrderPredecessor(TreeNode root){
        if(root == null){
            return null;
        }
        
        root = root.left;
        
        if(root == null){
            return null;
        }
        
        while(root.right != null){
            root = root.right;
        }
        
        return root;
    }
}