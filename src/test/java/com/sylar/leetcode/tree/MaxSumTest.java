package com.sylar.leetcode.tree;

import org.junit.Test;

public class MaxSumTest {
    @Test
    public void test_01() {
        Integer[] nums = {1, 2, 3};
        TreeNode root = TreeNode.valueOf(nums);
        MaxSum ms = new MaxSum();
        System.out.println(ms.maxPathSum(root));
    }

    @Test
    public void test_02() {
        Integer[] nums = {-10, 9, 20, null, null, 15, 7};
        TreeNode root = TreeNode.valueOf(nums);
        MaxSum ms = new MaxSum();
        System.out.println(ms.maxPathSum(root));
    }
}