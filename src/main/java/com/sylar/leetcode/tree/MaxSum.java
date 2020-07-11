package com.sylar.leetcode.tree;

public class MaxSum {
    private int ans = Integer.MIN_VALUE;

    public int maxPathSum(TreeNode root) {
        transfer(root);
        return ans;
    }

    private int transfer(TreeNode root) {
        if (root == null) {
            return 0;
        }

        int left = Math.max(0, transfer(root.left));
        int right = Math.max(0, transfer(root.right));
        ans = Math.max(ans, left + right + root.val);
        return Math.max(left, right) + root.val;
    }
}
