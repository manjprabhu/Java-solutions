package com.mnj.java_solutions.tree;

public class LowestCommonAncestorInBST {

    public void commonAncestor() {
        int n1 = 10;
        int n2 = 14;
        TreeNode node = new TreeNode();
        TreeNode.Node root = node.insert();
        if (root == null) {
            return;
        }
        while (root != null) {
            if (root.data > n1 && root.data > n2) {
                root = root.left;
            }
            if (root.data < n1 && root.data < n2) {
                root = root.right;
            } else
                break;
        }
        System.out.println("==>> Lowest common ancestor is :" + root.data);
    }
}
