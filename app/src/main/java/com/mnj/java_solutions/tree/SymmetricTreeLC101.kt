package com.mnj.java_solutions.tree

/**
 * Given the root of a binary tree, check whether it is a mirror of itself (i.e., symmetric around its center).
 *
 *
 *
 *
 *
 *
 * Example 1:
 *
 *
 *
 *
 * Input: root = [1,2,2,3,4,4,3]
 * Output: true
 */
class SymmetricTreeLC101 {
    val isSymmetric: Unit
        get() {
            val node = TreeNode()
            val root = node.insert()
            if (isMirrorTree(root, root)) {
                println("==>> Tree is symmetric...")
                return
            } else {
                println("==>> Tree is NOT symmetric...")
            }
        }

    private fun isMirrorTree(t1: TreeNode.Node?, t2: TreeNode.Node?): Boolean {
        if (t1 == null && t2 == null) return true
        return if (t1 == null || t2 == null) false else t1.data == t2.data && isMirrorTree(
            t1.left,
            t2.right
        ) && isMirrorTree(t1.right, t2.left)
    }
}