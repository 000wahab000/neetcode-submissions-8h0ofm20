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
        TreeNode res = null;
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        result(root,p,q);
        return res;
        
    }
   public TreeNode result(TreeNode node , TreeNode a1 , TreeNode a2){
    if (node == null) return null;
    if (a1.val > node.val && a2.val > node.val){
        return result(node.right,a1,a2);
    }
    else if (a1.val < node.val && a2.val < node.val){
        return result(node.left,a1,a2);
    }
    else return res = node;

   }
}