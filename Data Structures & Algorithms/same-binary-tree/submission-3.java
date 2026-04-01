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
    public boolean isSameTree(TreeNode p, TreeNode q) {
        same(p,q);
        return res;
    }
    public int same(TreeNode n1 , TreeNode n2){
        if (n1 == null && n2 == null) return 0;  
        if (n1 == null || n2 == null) { res = false; return 0; }  
        if (n1.val != n2.val) { res = false; return 0; }  
        
        int x = same(n1.left , n2.left);
        if (n1.val != n2.val ) res = false;
        int a = same(n1.right , n2.right);
        if (n1.val != n2.val) res = false;
    
        return 1 + Math.max(a , x);
    }
        
}
