public int diameterOfBinaryTree(TreeNode root) {
        // Recursion : 3 possibilities, longest path on left/ right / through root
        if (root == null) return 0;
        return Math.max(
            Math.max(diameterOfBinaryTree(root.left), diameterOfBinaryTree(root.right)), 
            height(root.left) + height(root.right) + 2);
    }
    private int height(TreeNode root) {
        if(root == null) return -1;
        return Math.max(height(root.left), height(root.right)) + 1;
    }

    // int ans=0;
    // public int diameterOfBinaryTree(TreeNode root) {
    //     if(root==null )return 0;
    //     height(root);
    //     return ans;
    // }
    
    // public int height(TreeNode root){
    //     //if root==null height==0
    //     if(root==null)return -1;
        
    //     int L=height(root.left);
    //     int R=height(root.right);
    //     //ans signfies(no. of nodes farthest apart) or the DIAMETER
    //     ans=Math.max(ans,L+R+2);
    //     //height of the tree is max of LST & RST +1
    //     return 1+Math.max(L,R);
    // }
