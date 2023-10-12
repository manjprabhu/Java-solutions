package com.mnj.java_solutions.tree;

import java.util.HashSet;

/**
 * Given a binary tree, find out whether it contains a duplicate sub-tree of size two or more, or not.
 * <p>
 * Note: Two same leaf nodes are not considered as subtree as size of a leaf node is one.
 * <p>
 * Example 1 :
 * <p>
 * Input :
 * 1
 * /   \
 * 2       3
 * /   \       \
 * 4     5       2
 * /  \
 * 4    5
 * Output : 1
 * Explanation :
 * 2
 * /   \
 * 4     5
 * is the duplicate sub-tree.
 * Example 2 :
 * <p>
 * Input :
 * 1
 * /   \
 * 2       3
 * Output: 0
 * Explanation: There is no duplicate sub-tree
 * in the given binary tree.
 **/
public class DuplicateSubtreeInBinaryTree12102023 {

    String mark = "$";
    HashSet<String> subtree = new HashSet<>();

    public void dupSub() {
        TreeNode node = new TreeNode();
        TreeNode.Node root = node.insert();

        String str = dup(root);

        if (str.equals("#")) {
            System.out.println("The binary tree contains a duplicate sub-tree of size two or more");
        } else {
            System.out.println("The binary tree DOES NOT contains a duplicate sub-tree of size two or more");
        }
    }

    private String dup(TreeNode.Node root) {
        StringBuilder s = new StringBuilder();
        s.append("");
        if (root == null)
            return s.append(mark).toString(); // If root is null, return "$".

        String lstr = dup(root.left);
        if (lstr.equals("#")) // If a duplicate subtree is found, do not check further.
            return "#";

        String rstr = dup(root.right);
        if (rstr.equals("#")) // If a duplicate subtree is found, do not check further.
            return "#";

        // To return the subtree string to its parent call.
        s = s.append(root.data).append(lstr).append(rstr);
        if (s.length() > 3 && subtree.contains(s.toString()))  // >3 to avoid checking leaf nodes
            return "#";

        subtree.add(s.toString());
        return s.toString();
    }
}
