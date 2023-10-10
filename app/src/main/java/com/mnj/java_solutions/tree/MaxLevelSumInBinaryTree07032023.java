package com.mnj.java_solutions.tree;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Given a Binary Tree having positive and negative nodes. Find the maximum sum of a level in the given Binary Tree.
 * <p>
 * Example 1:
 * <p>
 * Input :
 * 4
 * /    \
 * 2     -5
 * / \    / \
 * -1   3  -2  6
 * <p>
 * Output: 6
 * <p>
 * Explanation :
 * Sum of all nodes of 0'th level is 4
 * Sum of all nodes of 1'th level is -3
 * Sum of all nodes of 2'th level is 6
 * Hence maximum sum is 6
 * <p>
 * Example 2:
 * <p>
 * Input :
 * 1
 * /   \
 * 2     3
 * / \     \
 * 4   5     8
 * / \
 * 6   7
 * <p>
 * Output :  17
 * <p>
 * Explanation: Maximum sum is at level 2.
 **/
public class MaxLevelSumInBinaryTree07032023 {

    public void maxLevelSum() {

        TreeNode node = new TreeNode();
        TreeNode.Node root = node.insert();
        Queue<TreeNode.Node> q = new LinkedList<>();
        q.add(root);

        int ans = Integer.MIN_VALUE;
        while (!q.isEmpty()) //s2
        {
            int n = q.size();
            int sum = 0; // maintain the sum of nodes each each level
            for (int i = 0; i < n; i++) //s3 itr in nodes of each level
            {
                TreeNode.Node curr = q.poll();
                sum += curr.data;
                if (curr.left != null) q.add(curr.left);
                if (curr.right != null) q.add(curr.right);

            }
            ans = Math.max(ans, sum);  // after each level , track the the maximum sum.
        }
        System.out.println("==>> Maximum sum is  :" + ans);
    }
}
