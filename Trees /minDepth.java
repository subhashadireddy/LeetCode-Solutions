 if (root == null) {
            return 0;
        }

        // If left subtree is null, go to right subtree
        if (root.left == null) {
            return 1 + minDepth(root.right);
        }

        // If right subtree is null, go to left subtree
        if (root.right == null) {
            return 1 + minDepth(root.left);
        }
