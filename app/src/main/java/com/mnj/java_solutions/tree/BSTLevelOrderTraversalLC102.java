package com.mnj.java_solutions.tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BSTLevelOrderTraversalLC102 {

    //Recursive approach using queue
    List<List<Integer>> recursiveResult;

    //Iterative approach using queue
    public void levelOrderTraversal() {
        TreeNode node = new TreeNode();
        TreeNode.Node root = node.insert();

        List<List<Integer>> result = new ArrayList<>();

        if (root == null) {
            System.out.println("==>> Empty tree ");
            return;
        }

        Queue<TreeNode.Node> queue = new LinkedList<>();
        queue.offer(root);

        while (!queue.isEmpty()) {
            int size = queue.size();// number elements at each level

            // we need to return the value in list of list, this list
            // holds the nodes at particulat level.
            List<Integer> currentLevel = new ArrayList<>();

            while (size-- > 0) {
                TreeNode.Node curr = queue.poll();
                currentLevel.add(curr.data);
                if (curr.left != null)
                    queue.offer(curr.left);
                if (curr.right != null)
                    queue.offer(curr.right);
            }
            result.add(currentLevel);
        }
    }

    public void levelOrderTraversal2() {

        recursiveResult = new ArrayList<>();
        TreeNode node = new TreeNode();
        TreeNode.Node root = node.insert();
        traverse(root, 0);

    }

    private void traverse(TreeNode.Node node, int level) {
        if (node == null)
            return;

        if (recursiveResult.size() == level)
            recursiveResult.add(new ArrayList<>());

        recursiveResult.get(level).add(node.data);
        traverse(node.left, level + 1);
        traverse(node.right, level + 1);

    }
}
