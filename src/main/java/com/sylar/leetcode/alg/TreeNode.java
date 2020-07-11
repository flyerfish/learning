package com.sylar.leetcode.alg;


/**
 * TreeNode
 *
 * @param <T>
 * @Author
 */
public class TreeNode<T> {
    T val;
    TreeNode left;
    TreeNode right;

    TreeNode(T t) {
        val = t;
    }

    public static <T> TreeNode<T> valueOf(T[] vars) {
        if (vars.length == 0) {
            return null;
        }
        TreeNode<T> root = new TreeNode<>(vars[0]);
        valueOf(root, vars, 1);
        return root;
    }

    private static <T> void valueOf(TreeNode<T> root, T[] vars, int pos) {
        if (pos >= vars.length || root == null) {
            return;
        }

        TreeNode<T> left = null;
        TreeNode<T> right = null;
        if (vars[pos] != null) {
            left = new TreeNode<>(vars[pos]);
        }
        if (vars[pos + 1] != null) {
            right = new TreeNode<>(vars[pos + 1]);
        }

        root.left = left;
        root.right = right;
        valueOf(left, vars, pos + 2);
        valueOf(right, vars, pos + 4);
    }
}
