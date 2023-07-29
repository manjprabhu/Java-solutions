package com.mnj.java_solutions.tree;

import java.util.ArrayList;
import java.util.List;

public class PathSumLC113 {

    public void pathSum(TreeNode.Node root, int target, List<ArrayList<Integer>> res, ArrayList<Integer> ans) {
        if (root == null)
            return;

        if (root.left == null && root.right == null) {
            if (target - root.data == 0) {
                ArrayList<Integer> base = new ArrayList<>(ans);
                base.add(root.data);
                res.add(base);
            }
        }

        ans.add(root.data);
        pathSum(root.left, target - root.left.data, res, ans);
        pathSum(root.right, target - root.right.data, res, ans);

        ans.remove(ans.size() - 1);
    }

    public void pathSum() {
        TreeNode node = new TreeNode();
        TreeNode.Node root = node.insert();
        int target = 10;
        List<ArrayList<Integer>> res = new ArrayList<>();
        ArrayList<Integer> ans = new ArrayList<>();
        pathSum(root, target, res, ans);

        for (int i = 0; i < res.size(); i++) {
            System.out.println("==>> elements :" + res.get(i));
        }
    }
}
