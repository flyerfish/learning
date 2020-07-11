package com.sylar.leetcode.tree;

/**
 * TreeNode
 *
 * @author sniper
 */
public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }

    public static TreeNode valueOf(Integer[] vars) {
        if (vars.length == 0) {
            return null;
        }
        TreeNode root = new TreeNode(vars[0]);
        valueOf(root, vars, 1);
        return root;
    }

    private static void valueOf(TreeNode root, Integer[] vars, int pos) {
        if (pos >= vars.length || root == null) {
            return;
        }

        TreeNode left = null;
        TreeNode right = null;
        if (vars[pos] != null) {
            left = new TreeNode(vars[pos]);
        }
        if (vars[pos + 1] != null) {
            right = new TreeNode(vars[pos + 1]);
        }

        root.left = left;
        root.right = right;
        valueOf(left, vars, pos + 2);
        valueOf(right, vars, pos + 4);
    }
}

