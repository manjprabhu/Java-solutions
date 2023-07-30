package com.mnj.java_solutions.tree;

import java.util.ArrayList;
import java.util.List;

public class InorderTraversalOfBST {

    List<Integer> list;

    public void inorderTraversal() {
        TreeNode node = new TreeNode();
        TreeNode.Node root = node.insert();
        list = new ArrayList<>();
        inOrder(root);

        System.out.println("==>> Inorder traversal of BST");
        for (int i = 0; i < list.size(); i++)
            System.out.println(list.get(i));
    }

    private void inOrder(TreeNode.Node root) {
        if (root == null)
            return;
        inOrder(root.left);
        list.add(root.data);
        inOrder(root.right);
    }
}
