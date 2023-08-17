package com.mnj.java_solutions.tree;

import java.util.ArrayList;
import java.util.List;

public class LeftSideViewOfBinaryTree {

    public void leftSideView() {
        TreeNode node = new TreeNode();
        TreeNode.Node root = node.insert();
        List<Integer> recursiveResult = new ArrayList<>();
        leftView(root, recursiveResult, 0);

        for (int num : recursiveResult)
            System.out.println("==>> Left view element of Binary tree are :" + num);
    }

    private void leftView(TreeNode.Node node, List<Integer> result, int currentDepth) {
        if (node == null)
            return;

        if (currentDepth == result.size())
            result.add(node.data);

        leftView(node.left, result, currentDepth + 1);
        leftView(node.right, result, currentDepth + 1);
    }
}
