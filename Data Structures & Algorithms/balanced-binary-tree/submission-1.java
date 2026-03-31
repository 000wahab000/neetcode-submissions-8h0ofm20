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
    boolean res = true;
    public boolean isBalanced(TreeNode root) {
        balanced(root);
        return res;
    }
    public int balanced(TreeNode node){
        if (node == null) return 0;
        int left = balanced(node.left);
        int right = balanced(node.right);
        if (Math.abs(left - right) > 1){res = false;}
        return 1 + Math.max(left, right);
    }
}
