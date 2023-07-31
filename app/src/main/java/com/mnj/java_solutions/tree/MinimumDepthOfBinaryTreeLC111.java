package com.mnj.java_solutions.tree;

public class MinimumDepthOfBinaryTreeLC111 {

    public void minimumDepth() {
        TreeNode node = new TreeNode();
        TreeNode.Node root = node.insert();
        System.out.println("==>> Minimum depth of binary tree :" + minDepth(root));
    }

    private int minDepth(TreeNode.Node root) {
        if (root == null)
            return 0;
        else {
            int lHeight = minDepth(root.left) + 1;
            int rHeight = minDepth(root.right) + 1;

            if (root.left == null)
                return rHeight;

            if (root.right == null)
                return lHeight;

            int depth = Math.min(lHeight, rHeight);
            return depth;
        }
    }
}
