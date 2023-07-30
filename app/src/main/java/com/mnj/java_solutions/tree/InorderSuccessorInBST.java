package com.mnj.java_solutions.tree;

import java.util.ArrayList;
import java.util.List;

public class InorderSuccessorInBST {

    List<Integer> list;

    public void inorderSuccessor() {
        TreeNode node = new TreeNode();
        TreeNode.Node root = node.insert();
        list = new ArrayList<>();
        TreeNode.Node x = new TreeNode.Node(8);
        TreeNode.Node successor = null;

        while (root != null) {
            if (x.data >= root.data)
                root = root.right;
            else {
                successor = root;
                root = root.left;
            }
        }
        System.out.println("==>> Inorder successor in BST :" + successor.data);
    }
}
