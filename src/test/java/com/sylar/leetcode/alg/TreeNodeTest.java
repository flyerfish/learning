package com.sylar.leetcode.alg;

import org.junit.Test;

public class TreeNodeTest {

    @Test
    public void test_valueOf() {
        Integer[] nums = {-10, 9, 20, null, null, 15, 7, 3, 2, null, 1};
        TreeNode<Integer> root = TreeNode.valueOf(nums);
    }
}