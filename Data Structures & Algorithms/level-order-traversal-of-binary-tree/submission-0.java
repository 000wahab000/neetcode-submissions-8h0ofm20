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
    public List<List<Integer>> levelOrder(TreeNode root) {
    List<List<Integer>> l1 = new ArrayList<>();
    Queue<TreeNode> queue = new LinkedList<>();
    queue.offer(root);

    while (!queue.isEmpty()){
        List<Integer> l2 = new ArrayList<>();
        int size = queue.size();

        for (int i = 0 ; i < size ; i++){
            TreeNode t1 = queue.poll();
            if (root != null){
            l2.add(t1.val);
            }
            else return l1;

            if (t1.left != null) {queue.offer(t1.left);}
            if (t1.right != null) {queue.offer(t1.right);}
        }

    l1.add(l2);
    
    }
    return l1;
    }
}
