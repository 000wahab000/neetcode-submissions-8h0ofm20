class Solution {
    int res = 0; 
    public int diameterOfBinaryTree(TreeNode root) {
        height(root);
        return res;
    }
    public int height(TreeNode node) {
        if (node == null) return 0;
        int left = height(node.left);   
        int right = height(node.right);  
        res = Math.max(res, left + right);  
        return 1 + Math.max(right, left);  
    }
}