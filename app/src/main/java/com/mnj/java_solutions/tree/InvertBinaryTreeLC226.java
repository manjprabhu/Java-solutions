package com.mnj.java_solutions.tree;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Given the root of a binary tree, invert the tree, and return its root.
 * Input: root = [4,2,7,1,3,6,9]
 * Output: [4,7,2,9,6,3,1]
 **/
public class InvertBinaryTreeLC226 {

    public void invertTree() {
        TreeNode node = new TreeNode();
        TreeNode.Node root = node.insert();
        TreeNode.Node result = invertRecursive(root);
    }


    //Recursive approach
    private TreeNode.Node invertRecursive(TreeNode.Node root) {
        if (root == null)
            return null;

        TreeNode.Node left = invertRecursive(root.left);
        TreeNode.Node right = invertRecursive(root.right);

        root.left = right;
        root.right = left;
        return root;
    }

    //Level order traversal
    private void invertTree2() {
        TreeNode node = new TreeNode();
        TreeNode.Node root = node.insert();

        if (root == null) {
            System.out.println("==>> Empty tree ");
            return;
        }

        Queue<TreeNode.Node> queue = new LinkedList<>();
        queue.offer(root);

        while (!queue.isEmpty()) {
            TreeNode.Node curr = queue.poll();

            //swap the left and right child nodes of curr
            final TreeNode.Node temp = curr.left;
            curr.left = curr.right;
            curr.right = temp;

            if (curr.left != null)
                queue.offer(curr.left);
            if (curr.right != null)
                queue.offer(curr.right);
        }
    }
}
