    private boolean result = true;
    public boolean isBalanced(TreeNode root) {
        // Height-Balanced - depth of the two subtrees of every node never differs by more than one.
        // compare heights from left and right branch
        maxDepth(root);
        return result;
    }
    private int maxDepth(TreeNode root) {
        if (root == null)
            return 0;
        int l = maxDepth(root.left);
        int r = maxDepth(root.right);
        if (Math.abs(l - r) > 1)
            result = false;
        return 1 + Math.max(l, r);
    }
