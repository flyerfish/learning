package com.sylar.leetcode.tree;

import org.junit.Test;

public class TreeNodeTest {

    @Test
    public void valueOf() {
        Integer[] nums = {-10, 9, 20, null, null, 15, 7, 3, 2, null, 1};
        TreeNode root = TreeNode.valueOf(nums);
        nums = null;
    }
}