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
        ArrayList<Integer> arr1 = new ArrayList<>();
        
        inorder(root, arr1);
        
        // boolean f= true;
        for(int i=0; i<arr1.size()-1; i++){
            if(arr1.get(i)>= arr1.get(i+1)){
                return false;
            }
        }
        
        return true;
    }
    
    void inorder(TreeNode root, ArrayList<Integer> ans){
        if(root == null){
            return;
        }
        
        inorder(root.left, ans);
        ans.add(root.val);
        inorder(root.right, ans);
    }
}