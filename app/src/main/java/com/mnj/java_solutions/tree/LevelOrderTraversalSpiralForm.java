package com.mnj.java_solutions.tree;

import java.util.ArrayList;
import java.util.Stack;

public class LevelOrderTraversalSpiralForm {

    public void findSpiral() {

        TreeNode node = new TreeNode();
        TreeNode.Node root = node.insert();

        if (root == null) {
            return;
        }

        ArrayList<Integer> result = new ArrayList<>();

        Stack<TreeNode.Node> s1 = new Stack<>();
        Stack<TreeNode.Node> s2 = new Stack<>();

        s1.push(root);
        while (!s1.isEmpty() || !s2.isEmpty()) {
            while (!s1.isEmpty()) {
                TreeNode.Node temp = s1.pop();
                result.add(temp.data);

                if (temp.right != null) s2.push(temp.right);
                if (temp.left != null) s2.push(temp.left);
            }
            while (!s2.isEmpty()) {
                TreeNode.Node temp = s2.pop();
                result.add(temp.data);

                if (temp.left != null) s1.push(temp.left);
                if (temp.right != null) s1.push(temp.right);
            }
        }

        for (int i = 0; i < result.size(); i++)
            System.out.println("==>> :" + result.get(i));
    }
}
