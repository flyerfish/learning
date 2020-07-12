package com.sylar.leetcode.tree;

public class Symmetric {
    public boolean isSymmetric(TreeNode root) {
        return root == null ? true : transfer(root.left, root.right);
    }

    boolean transfer(TreeNode left, TreeNode right) {
        if (left == null && right == null) {
            return true;
        }
        if (left == null || right == null || left.val != right.val) {
            return false;
        }
        return transfer(left.left, right.right) && transfer(left.right, right.left);
    }
}
