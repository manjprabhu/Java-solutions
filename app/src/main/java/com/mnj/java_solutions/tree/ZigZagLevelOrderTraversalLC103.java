package com.mnj.java_solutions.tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

/***
 *
 * Given the root of a binary tree, return the zigzag level order traversal of its nodes' values.
 * (i.e., from left to right, then right to left for the next level and alternate between).
 *
 *
 * Input: root = [3,9,20,null,null,15,7]
 * Output: [[3],[20,9],[15,7]]
 *
 * */
public class ZigZagLevelOrderTraversalLC103 {

    public void zigZagLevelOrderTraversal() {
        TreeNode node = new TreeNode();
        TreeNode.Node root = node.insert();

        List<List<Integer>> result = new ArrayList<>();

        if (root == null) {
            System.out.println("==>> Empty tree ");
            return;
        }

        Queue<TreeNode.Node> queue = new LinkedList<>();
        queue.offer(root);
        boolean flag = false;

        while (!queue.isEmpty()) {
            int levelSize = queue.size();

            Stack<Integer> reverseStack = new Stack<>();
            List<Integer> currentLevel = new ArrayList<>();

            while (levelSize-- > 0) {
                TreeNode.Node currentNode = queue.poll();
                if (flag) {
                    reverseStack.add(currentNode.data);
                } else {
                    currentLevel.add(currentNode.data);
                }

                if (currentNode.left != null)
                    queue.offer(currentNode.left);
                if (currentNode.right != null)
                    queue.offer(currentNode.right);
            }
            flag = !flag;
            while (!reverseStack.isEmpty()) {
                currentLevel.add(reverseStack.pop());
            }
            result.add(currentLevel);
        }

        printListOfLists(result);
    }

    private void printListOfLists(List<List<Integer>> listOfLists) {
        System.out.println("\n         Result          ");
        System.out.println("==>> -------------------------------------");

        for (List<Integer> list : listOfLists) {
            System.out.print("  [");

            for (int item : list) {
                System.out.print("  "
                        + item
                        + ", ");
            }
            System.out.println("], ");
        }
        System.out.println("]");
    }
}
