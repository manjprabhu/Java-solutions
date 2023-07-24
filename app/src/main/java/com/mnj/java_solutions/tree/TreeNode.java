package com.mnj.java_solutions.tree;

public class TreeNode {

    public Node insert() {

        TreeNode.Node t1 = new TreeNode.Node(1);
        t1.left = new TreeNode.Node(2);
        t1.right = new TreeNode.Node(3);
        t1.left.left = new Node(4);
        t1.left.right = new Node(5);
        t1.right.left = new Node(6);
        t1.right.right = new Node(7);
        t1.right.left.right = new Node(8);
        return t1;
    }

    static class Node {
        int data;
        TreeNode.Node left;
        TreeNode.Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
}
