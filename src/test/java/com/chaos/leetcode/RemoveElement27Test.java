package com.chaos.leetcode;

import org.junit.Assert;
import org.junit.Test;

public class RemoveElement27Test {
    @Test
    public void test_001() {
        int[] nums = {3, 2, 2, 3};
        Assert.assertEquals(2, new RemoveElement27().removeElement(nums, 3));
    }

    @Test
    public void test_002() {
        int[] nums = {0, 1, 2, 2, 3, 0, 4, 2};
        Assert.assertEquals(5, new RemoveElement27().removeElement(nums, 2));
    }
}