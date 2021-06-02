package com.chaos.leetcode;

import com.chaos.leetcode.common.TreeNode;
import org.junit.Assert;
import org.junit.Test;

public class HouseRobber337Test {
    @Test
    public void test_rob_001() {
        Integer[] nums = {3, 2, 3, null, 3, null, 1};
        TreeNode root = TreeNode.valueOf(nums);
        HouseRobber337 hr = new HouseRobber337();
        Assert.assertEquals(7, hr.rob(root));

    }

    @Test
    public void test_rob_002() {
        Integer[] nums = {3, 4, 5, 1, 3, null, 1};
        TreeNode root = TreeNode.valueOf(nums);
        HouseRobber337 hr = new HouseRobber337();
        Assert.assertEquals(9, hr.rob(root));
    }
}