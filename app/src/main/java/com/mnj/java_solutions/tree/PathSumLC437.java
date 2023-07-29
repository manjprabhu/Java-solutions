package com.mnj.java_solutions.tree;

public class PathSumLC437 {

    int result = 0;

    public void pathSum() {
        TreeNode node = new TreeNode();
        TreeNode.Node root = node.insert();
        int targetSum = 29;
        pathSum(root, targetSum);
    }

    private void pathSum(TreeNode.Node root, int targetSum) {
        if (root == null)
            return;

        calculatePathSum(root, targetSum, 0);
        pathSum(root.left, targetSum);
        pathSum(root.right, targetSum);
        System.out.println("==>> target sum path: " + result);
    }

    private void calculatePathSum(TreeNode.Node root, int targetSum, long currentSum) {
        if (root == null)
            return;
        currentSum = currentSum + root.data;
        if (currentSum == targetSum)
            result++;
        calculatePathSum(root.left, targetSum, currentSum);
        calculatePathSum(root.right, targetSum, currentSum);
    }
}
