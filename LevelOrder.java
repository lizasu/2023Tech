public List<List<Integer>> levelOrder(TreeNode root) {
        // return level order traversal of its nodes
        // BFS ? level by level !
        List<List<Integer>> res = new ArrayList<>();
        Queue<TreeNode> qu = new LinkedList<TreeNode>();

        qu.add(root);

        while(!qu.isEmpty()) {
            int size = qu.size();
            List<Integer> layer = new ArrayList<>();
            for (int i = 0; i < size; i++) {
                TreeNode curr = qu.poll();
                if (curr!= null) {
                    layer.add(curr.val);
                    qu.offer(curr.left);
                    qu.offer(curr.right);
                }
            }
            if (layer.size() > 0) {
                res.add(layer);
            }
        }

        return res;
    }
