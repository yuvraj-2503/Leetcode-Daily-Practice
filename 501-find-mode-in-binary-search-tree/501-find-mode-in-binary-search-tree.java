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
    public int[] findMode(TreeNode root) {
        HashMap<Integer, Integer> mp = new HashMap<>();
        inorder(root, mp);
        ArrayList<Integer> arr = new ArrayList<>();
        int mx =0;
        for(int x: mp.keySet()){
            int val = mp.get(x);
            if(val > mx){
                arr.clear();
                mx = val;
                arr.add(x);
            }else if(val == mx){
                arr.add(x);
            }
        }
        
        int[] ans = new int[arr.size()];
        int j=0;
        for(int x: arr){
            ans[j++] = x;
        }
        
        return ans;
        
        
    }
    
    void inorder(TreeNode root, HashMap<Integer, Integer> mp){
        if(root == null){
            return;
        }
        
        inorder(root.left, mp);
        mp.put(root.val, mp.getOrDefault(root.val, 0) + 1);
        inorder(root.right, mp);
    }
}