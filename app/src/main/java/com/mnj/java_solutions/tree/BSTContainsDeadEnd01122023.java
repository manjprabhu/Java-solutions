package com.mnj.java_solutions.tree;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/***
 *
 * Money can’t buy you happiness. But Geekbits can buy you GfG goodies and it’s the same thing. Earn 2X Geekbits Now
 *
 * banner
 * Given a Binary Search Tree that contains unique positive integer values greater than 0. The task is to complete the function isDeadEnd which returns true if the BST contains a dead end else returns false. Here Dead End means a leaf node, at which no other node can be inserted.
 *
 * Example 1:
 *
 * Input :
 *                8
 *              /   \
 *            5      9
 *          /  \
 *         2    7
 *        /
 *       1
 *
 * Output :
 * Yes
 * Explanation :
 * Node 1 is a Dead End in the given BST.
 * Example 2:
 *
 * Input :
 *               8
 *             /   \
 *            7     10
 *          /      /   \
 *         2      9     13
 *
 * Output :
 * Yes
 * Explanation :
 * Node 9 is a Dead End in the given BST.
 *
 * **/
public class BSTContainsDeadEnd01122023 {

    static void solution(TreeNode.Node node, HashSet<Integer> set, List<Integer> list) {
        if (node == null) return;
        if (node.left == null && node.right == null) list.add(node.data);
        solution(node.left, set, list);
        set.add(node.data);
        solution(node.right, set, list);
    }

    public void isDeadEnd() {
        TreeNode node = new TreeNode();
        TreeNode.Node root = node.insert();

        HashSet<Integer> set = new HashSet<>();
        List<Integer> list = new ArrayList<>();
        solution(root, set, list);

        for (int x : list) {
            if (x == 1 && set.contains(x + 1)) {
                System.out.println("==>> BST contains dead end...");
                return;
            } else if (set.contains(x - 1) && set.contains(x + 1)) {
                System.out.println("==>> BST does NOT contains dead end...");
                return;
            }
        }
        System.out.println("==>> BST does NOT contains dead end...");
    }
}
