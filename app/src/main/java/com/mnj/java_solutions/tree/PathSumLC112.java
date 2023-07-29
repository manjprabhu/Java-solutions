package com.mnj.java_solutions.tree;

import java.util.Stack;

public class PathSumLC112 {

    public void pathSum() {
        TreeNode node = new TreeNode();
        TreeNode.Node root = node.insert();

        Stack<TreeNode.Node> stack = new Stack<>();
        Stack<Integer> sumStack = new Stack<>();

        int sum = 27;

        stack.push(root);
        sumStack.push(root.data);

        while (!stack.isEmpty()) {
            TreeNode.Node temp = stack.pop();
            int val = sumStack.pop();

            if (temp.left == null && temp.right == null && val == sum) {
                System.out.println("==>> There exists path of given sum");
                return;
            }
            if (temp.left != null) {
                stack.push(temp.left);
                sumStack.push(val + temp.left.data);
            }

            if (temp.right != null) {
                stack.push(temp.right);
                sumStack.push(val + temp.right.data);
            }
        }

        System.out.println("==>> There exists NO path of given sum");

    }
}
