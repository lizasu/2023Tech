public TreeNode invertTree(TreeNode root) {
        // Recursion
        // if (root== null) {
        //     return;
        // }
        // TreeNode tmp = root.right;
        // root.right = root.left;
        // root.left = tmp;

        // invertTree(root.right);
        // invertTree(root.left);

        // Iterative
        // Put Nodes into a Queue - FILO
        // while queue is not empty
        // Right goes first into the queue
        // 
        TreeNode curr;
        Queue<TreeNode> qu = new LinkedList<TreeNode>();
        qu.offer(root);
        while(!qu.isEmpty()) {
            curr = qu.poll();
            if (curr == null) {
                continue;
            }
            if (curr.right != null) {
                qu.offer(curr.right);
            }
            if (curr.left != null) {
                qu.offer(curr.left);
            }
            TreeNode tmp = curr.right;
            curr.right = curr.left;
            curr.left = tmp;
        }
        return root;
    }
