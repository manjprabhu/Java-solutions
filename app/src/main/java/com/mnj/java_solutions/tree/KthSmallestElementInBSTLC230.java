package com.mnj.java_solutions.tree;

public class KthSmallestElementInBSTLC230 {

    int count = 0;

    public void kthSmallestElement() {
        TreeNode node = new TreeNode();
        TreeNode.Node root = node.insert();
        int k = 3;
        TreeNode.Node result = kthSmallest(root, k);
        System.out.println("==>> kth Smallest element is:" + result.data);
    }

    private TreeNode.Node kthSmallest(TreeNode.Node root, int k) {
        if (root == null)
            return null;
        TreeNode.Node left = kthSmallest(root.left, k);

        if (left != null)
            return left;
        count++;
        if (count == k)
            return root;
        return kthSmallest(root.right, k);

    }
}
