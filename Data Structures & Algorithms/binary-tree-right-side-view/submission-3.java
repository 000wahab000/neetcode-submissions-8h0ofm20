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
    public List<Integer> rightSideView(TreeNode root) {
    Queue<TreeNode> q1 = new LinkedList<>();
    List<Integer> l1 = new ArrayList<>();
    if (root == null) return l1;
    q1.offer(root);
    while (!q1.isEmpty()){
        int n = q1.size();
            for (int i = 0 ; i < n ; i++){
            TreeNode t1 = q1.poll();

            if (i == n - 1){l1.add(t1.val);}

            if (t1.left != null){q1.offer(t1.left);}
            if (t1.right != null ){q1.offer(t1.right);}
            }
        }
        return l1;
    }
}
