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
    public List<String> binaryTreePaths(TreeNode root) {
        ans = new ArrayList<>();
        ArrayList<Integer> path = new ArrayList<>();
        util(root, path);
        return ans;
    }
    
    List<String> ans;
    void printPath(ArrayList<Integer> path){
        String s = "";
        for(int i=0; i<path.size()-1; i++){
            s += path.get(i);
            s += "->";
        }
        s += path.get(path.size()-1);
        ans.add(s);
    }
    
    void util(TreeNode root, ArrayList<Integer> path){
        if(root == null){
            return;
        }
        
        path.add(root.val);
        if(root.left == null && root.right == null){
            printPath(path);
        }
        util(root.left, path);
        util(root.right, path);
        path.remove(path.size() - 1);
    }
}