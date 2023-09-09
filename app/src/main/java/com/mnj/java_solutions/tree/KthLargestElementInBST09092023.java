package com.mnj.java_solutions.tree;

/**
 *
 * Given a Binary Search Tree. Your task is to complete the function which will return the Kth largest
 * element without doing any modification in Binary Search Tree.
 *
 * Example 1:
 *
 * Input:
 *       4
 *     /   \
 *    2     9
 * k = 2
 * Output: 4
 * Example 2:
 *
 * Input:
 *        9
 *         \
 *           10
 * K = 1
 * Output: 10
 * **/

//Solution: Perform reverse inorder traversal.

public class KthLargestElementInBST09092023 {

    int count = 0;
    int result = 0;

    public void kthLargestElement() {
        TreeNode node = new TreeNode();
        TreeNode.Node root = node.insert();

        int k = 3;
        reverseInOrder(root, k);
        System.out.println("==>> Kth largest element in BST is  :"+ result);
    }


    private void reverseInOrder(TreeNode.Node root, int k) {
        if (root == null)
            return;
        reverseInOrder(root.right, k);
        count++;
        if (k == count) {
            result = root.data;
            return;
        }
        reverseInOrder(root.left, k);
    }
}
