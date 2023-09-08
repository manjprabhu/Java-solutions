package com.mnj.java_solutions.tree;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Given a Binary Tree, convert it to Binary Search Tree in such a way that keeps the original structure of Binary Tree intact.
 * Example 1:
 * <p>
 * Input:
 * 1
 * /   \
 * 2     3
 * Output:
 * 1 2 3
 * Explanation:
 * The converted BST will be
 * 2
 * /   \
 * 1     3
 **/

// A inorder traversal on BST is sorted, here we apply the reverse logic, first get all the nodes from binary tree into an arraylist
// then sort the arraylist. Once we get the sorted list, perform inorder traversal on sorted list.

public class BinaryTreeToBST08092023 {

    private int i = 0;

    public void binaryTreeToBST() {
        TreeNode node = new TreeNode();
        TreeNode.Node root = node.insert();

        ArrayList<Integer> list = new ArrayList<>();
        getNodes(root, list);

        Collections.sort(list);
        inorder(root, list);
        System.out.println("==>> Root of the BST is :"+root.data);
    }

    private void getNodes(TreeNode.Node root, ArrayList<Integer> list) {
        if (root == null) {
            return;
        }
        list.add(root.data);
        getNodes(root.left, list);
        getNodes(root.right, list);
    }

    //Basically update root of  the tree from elements of arraylist.
    private void inorder(TreeNode.Node root, ArrayList<Integer> list) {
        if (root == null) {
            return;
        }
        inorder(root.left, list);
        root.data = list.get(i++);
        inorder(root.right, list);
    }


}
