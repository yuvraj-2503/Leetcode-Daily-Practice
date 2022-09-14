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
    public int pseudoPalindromicPaths (TreeNode root) {
        int[] mp = new int[10];
        ans=0;
        dfs(root, mp);
        return ans;
    }
    
    int ans = 0;
    
    void dfs(TreeNode root, int[] mp){
        if(root == null){
            return;
        }
        
        mp[root.val]++;
        
        if(root.left == null && root.right == null){
            int cnt = 0;
            
            for(int i=1; i<=9; i++){
                if(mp[i] % 2 != 0){
                    cnt++;
                }
            }
            
            if(cnt <= 1){
                ans++;
            }
        }
        
        
        dfs(root.left, mp);
        dfs(root.right, mp);
        mp[root.val]--;
        
    }
}