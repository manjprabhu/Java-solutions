package com.mnj.java_solutions.tree;

import java.util.ArrayList;
import java.util.List;

public class RightSideViewOfBinaryTree {

    public void rightSideView() {
        TreeNode node = new TreeNode();
        TreeNode.Node root = node.insert();
        List<Integer> recursiveResult = new ArrayList<>();
        rightView(root,recursiveResult,0);

        for(int num : recursiveResult)
            System.out.println("==>> Right view element of Binary tree are :"+num);
    }

    private void rightView(TreeNode.Node node, List<Integer> result,int currentDepth) {
        if (node == null)
            return;

        if (currentDepth == result.size())
            result.add(node.data);

        rightView(node.right, result, currentDepth + 1);
        rightView(node.left, result, currentDepth + 1);

    }
}
