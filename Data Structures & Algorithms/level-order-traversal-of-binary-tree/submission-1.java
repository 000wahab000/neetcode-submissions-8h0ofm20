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
    Queue<TreeNode> q1 = new LinkedList<>();
    q1.offer(root);


    while (!q1.isEmpty()){
        int n = q1.size();
        List<Integer> l2 = new ArrayList<>();

        for (int i = 0 ; i < n ; i++){
            TreeNode t1 = q1.poll();
            if (root != null) {l2.add(t1.val);}
            else return l1;



            if (t1.left != null){q1.offer(t1.left);}
            if (t1.right != null){q1.offer(t1.right);}
            }
            l1.add(l2);
        }
        return l1;
    }
}
