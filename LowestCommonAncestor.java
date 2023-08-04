public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        // Given a BST(sorted + two leaves), find an ancestor common to both p and q
        // With Recursion
        // if both p and q or on same side, continue search on that side
        // if p and q are on different sides, we have found the lowest common ancestor
        if (root.val > p.val && root.val > q.val) {
            return lowestCommonAncestor(root.left, p, q);
        }
        if (root.val < p.val && root.val < q.val) {
            return lowestCommonAncestor(root.right, p, q);
        }
        return root;
    }
