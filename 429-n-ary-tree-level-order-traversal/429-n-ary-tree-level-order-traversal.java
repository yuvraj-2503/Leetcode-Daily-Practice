/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {
    public List<List<Integer>> levelOrder(Node root) {
         List<List<Integer>> list = new ArrayList<>();
        if (root == null) return list;
        
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        
        while (!queue.isEmpty()) {
            List<Integer> ls = new ArrayList<>();
            int n = queue.size();
            while (n -- > 0) {
                Node node = queue.poll();
                ls.add(node.val);
                
                for (Node node1 : node.children)
                    queue.offer(node1);
            }
            list.add(ls);
        }
        return list;
    }
}