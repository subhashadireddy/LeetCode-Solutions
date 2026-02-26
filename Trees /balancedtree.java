class Solution {

    public boolean isBalanced(TreeNode root) {
        return height(root) != -1;
    }

    int height(TreeNode root) {

        if (root == null) {
            return 0;
        }
        if (height(root.left) == -1) return -1;   // left subtree unbalanced
        if (height(root.right) == -1) return -1;  // right subtree unbalanced
        if (Math.abs(height(root.left) - height(root.right)) > 1) {
            return -1;               // current node unbalanced
        }
        return 1 + Math.max(height(root.left),height(root.right));  // return height to parent
    }
}
