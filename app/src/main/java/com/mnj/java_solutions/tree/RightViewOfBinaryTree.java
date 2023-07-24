package com.mnj.java_solutions.tree;

import java.util.LinkedList;
import java.util.Queue;

public class RightViewOfBinaryTree {

    public void rightView() {

        TreeNode node = new TreeNode();
        TreeNode.Node head = node.insert();

        if (head == null) {
            return;
        }

        Queue<TreeNode.Node> queue = new LinkedList<>();
        queue.add(head);


        while (!queue.isEmpty()) {

            // get number of nodes for each level
            int n = queue.size();

            // traverse all the nodes of the current level
            for (int i = 0; i < n; i++) {
                TreeNode.Node curr = queue.peek();
                queue.remove();


                // print the last node of each level
                if (i == n - 1) {
                    System.out.println("==>> : " + curr.data);
                    System.out.print(" ");
                }

                // if left child is not null add it into the queue
                if (curr.left != null) {
                    queue.add(curr.left);
                }

                // if right child is not null add  it into the queue
                if (curr.right != null) {
                    queue.add(curr.right);
                }
            }
        }
    }
}
