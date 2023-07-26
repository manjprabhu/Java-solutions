package com.mnj.java_solutions.tree;

import java.util.ArrayList;

public class KthAncestorOfNodeInBinaryTree {

    static boolean generateArray(TreeNode.Node root, int node, ArrayList<Integer> ancestors) {
        // There will be no ancestor of root node
        if (root == null)
            return false;

        ancestors.add(root.data);
        if (root.data == node)
            return true;

        if (generateArray(root.left, node, ancestors) || generateArray(root.right, node, ancestors)) {
            return true;
        }
        ancestors.remove(ancestors.size() - 1);
        return false;
    }

    public void kthAncestor() {
        TreeNode node = new TreeNode();
        TreeNode.Node root = node.insert();

        if (root == null) {
            return;
        }
        int k = 4;
        int nd = 8;

        ArrayList<Integer> list = new ArrayList<>();

        if (generateArray(root, nd, list)) {
            if (k < list.size()) {
                System.out.println("==>> Kth ancestor of the given node is  :" + list.get(list.size() - 1 - k));
                return;
            }
            System.out.println("==>>> " + -1);
        }
    }
}
