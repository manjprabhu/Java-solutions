package com.mnj.java_solutions.tree;

/**
 * Given a binary tree, find if it is height balanced or not.
 * A tree is height balanced if difference between heights of left and right subtrees is not more than one for all nodes of tree.
 *
 * A height balanced tree
 *         1
 *      /     \
 *    10      39
 *   /
 * 5
 *
 * An unbalanced tree
 *         1
 *      /
 *    10
 *   /
 * 5
 *
 * Example 1:
 *
 * Input:
 *       1
 *     /
 *    2
 *     \
 *      3
 * Output: 0
 * Explanation: The max difference in height
 * of left subtree and right subtree is 2,
 * which is greater than 1. Hence unbalanced
 * Example 2:
 *
 * Input:
 *        10
 *      /   \
 *     20   30
 *   /   \
 *  40   60
 * Output: 1
 * Explanation: The max difference in height
 * of left subtree and right subtree is 1.
 * Hence balanced. **/
public class CheckForBalancedTree11102023 {

    public void isBalanced() {
        TreeNode node = new TreeNode();
        TreeNode.Node root = node.insert();

         if(checkBalance(root) != -1) {
             System.out.println("==>> Tree is NOT balanced");
         } else {
             System.out.println("==>> Tree is balanced");
         }
    }

    private int checkBalance(TreeNode.Node root) {
        if (root == null) {
            return 0;
        }

        int lht = checkBalance(root.left);
        if (lht == -1) {
            return -1; // Left subtree is unbalanced, so the whole tree is unbalanced.
        }

        int rht = checkBalance(root.right);
        if (rht == -1) {
            return -1; // Right subtree is unbalanced, so the whole tree is unbalanced.
        }

        int heightDiff = Math.abs(lht - rht);
        if (heightDiff > 1) {
            return -1; // marking the tree is unbalanced.
        }

        return 1 + Math.max(lht, rht); // Return the height of the current subtree.
    }
}
