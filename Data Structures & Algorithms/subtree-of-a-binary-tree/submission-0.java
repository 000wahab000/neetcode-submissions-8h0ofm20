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
    boolean check = false;

    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        sub(root, subRoot);
        return check;
    }

    public void sub(TreeNode n1, TreeNode n2) {
        if (n1 == null) return;

        if (same(n1, n2)) check = true;

        sub(n1.left, n2);
        sub(n1.right, n2);
    }

    public boolean same(TreeNode n1, TreeNode n2) {
        if (n1 == null && n2 == null) return true;
        if (n1 == null || n2 == null) return false;
        if (n1.val != n2.val) return false;

        return same(n1.left, n2.left) && same(n1.right, n2.right);
    }
}