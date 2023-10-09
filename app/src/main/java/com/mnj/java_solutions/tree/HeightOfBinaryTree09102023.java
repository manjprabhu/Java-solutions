package com.mnj.java_solutions.tree;

/**
 * Given a binary tree, find its height.
 * <p>
 * Example 1:
 * <p>
 * Input:
 * 1
 * /  \
 * 2    3
 * Output: 2
 * <p>
 * <p>
 * Input:
 * 2
 * \
 * 1
 * /
 * 3
 * Output: 3
 **/
public class HeightOfBinaryTree09102023 {

    public void height() {
        TreeNode node = new TreeNode();
        TreeNode.Node root = node.insert();
        int height = height(root);
        System.out.println("==>> Height of the binary tree is :" + height);
    }

    private int height(TreeNode.Node node) {
        if (node == null)
            return 0;
        int x = height(node.left) + 1;
        int y = height(node.right) + 1;

        return x > y ? x : y;
    }
}
