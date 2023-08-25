public int maxDepth(TreeNode root) {
        // number of nodes along the longest path from root down to farthest leaf
        // BFS - number of layers
        if(root == null) {
            return 0;
        }
        Queue<TreeNode> qu = new LinkedList<TreeNode>();
        qu.offer(root);
        int height = 0;
        while (!qu.isEmpty()) {
            int layerCount = qu.size();
            while(layerCount > 0) {
                TreeNode curr = qu.poll();
                if (curr != null) {
                    if(curr.left != null)  {
                        qu.offer(curr.left);
                    }
                    if(curr.right != null)  {
                        qu.offer(curr.right);
                    }
                }
                layerCount--;
            }
            height++;
        }
        return height;
    }
