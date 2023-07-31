package com.mnj.java_solutions.tree;

public class MaxDepthOfBinaryTreeLC104 {

    public void maxDepth() {
        TreeNode node = new TreeNode();
        TreeNode.Node root = node.insert();
        System.out.println("==>> Maximum height of binary tree :" + maxDepth(root));
    }

    private int maxDepth(TreeNode.Node root) {
        if (root == null)
            return 0;
        else {
            int lHeight = maxDepth(root.left);
            int rHeight = maxDepth(root.right);
            if (lHeight > rHeight)
                return lHeight + 1;
            else
                return rHeight + 1;
        }
    }
}
