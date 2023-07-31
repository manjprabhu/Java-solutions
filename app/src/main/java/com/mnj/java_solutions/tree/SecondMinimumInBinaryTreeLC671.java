package com.mnj.java_solutions.tree;

public class SecondMinimumInBinaryTreeLC671 {

    public void findSecondMinimumValue() {
        TreeNode node = new TreeNode();
        TreeNode.Node head = node.insert();

        int result = findSecondMinimumValue(head);
        System.out.println("==>> Second smallest element  is :" + result);
    }

    private int findSecondMinimumValue(TreeNode.Node root) {
        if (root == null)
            return -1;

        if (root.left == null && root.right == null)
            return -1;

        int left = root.left.data;
        int right = root.right.data;

        if (root.left.data == root.data)
            left = findSecondMinimumValue(root.left);

        if (root.right.data == root.data)
            right = findSecondMinimumValue(root.right);

        if (left != -1 && right != -1)
            return Math.min(left, right);

        if (left != -1)
            return left;
        else return right;
    }
}
