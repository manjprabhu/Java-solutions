package com.mnj.java_solutions.tree;

import java.util.ArrayList;

public class MedianOfBST {

    public void median() {
        TreeNode node = new TreeNode();
        TreeNode.Node root = node.insert();

        ArrayList<Integer> list = new ArrayList<>();
        inorder(root, list);
        float median;
        int n = list.size();

        if (n % 2 == 0)
            median = (list.get(n / 2 - 1) + list.get(n / 2)) / 2.0f;
        else
            median = list.get(n / 2);

        System.out.println("==>> Median of BST is::" + median);
    }

    private void inorder(TreeNode.Node root, ArrayList<Integer> list) {
        if (root == null)
            return;
        inorder(root.left, list);
        list.add(root.data);
        inorder(root.right, list);
    }

}
