package com.mnj.java_solutions.tree;

/**
 * Given the root of a binary tree, check whether it is a mirror of itself (i.e., symmetric around its center).
 * <p>
 * <p>
 * <p>
 * Example 1:
 * <p>
 * <p>
 * Input: root = [1,2,2,3,4,4,3]
 * Output: true
 **/
public class SymmetricTreeLC101 {

    public void isSymmetric() {
        TreeNode node = new TreeNode();
        TreeNode.Node root = node.insert();

        if (isMirrorTree(root, root)) {
            System.out.println("==>> Tree is symmetric...");
            return;
        } else {
            System.out.println("==>> Tree is NOT symmetric...");
        }
    }

    private boolean isMirrorTree(TreeNode.Node t1, TreeNode.Node t2) {
        if (t1 == null && t2 == null)
            return true;
        if (t1 == null || t2 == null)
            return false;
        return (t1.data == t2.data) && isMirrorTree(t1.left, t2.right) && isMirrorTree(t1.right, t2.left);
    }
}
