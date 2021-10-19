package com.chaos.leetcode;

import org.junit.Assert;
import org.junit.Test;

public class MaxSubArray53Test {

    @Test
    public void test_001() {
        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        Assert.assertEquals(6, new MaxSubArray53().maxSubArray(nums));
    }

    @Test
    public void test_002() {
        int[] nums = {0};
        Assert.assertEquals(0, new MaxSubArray53().maxSubArray(nums));
    }

    @Test
    public void test_003() {
        int[] nums = {-100000};
        Assert.assertEquals(-100000, new MaxSubArray53().maxSubArray(nums));
    }

    @Test
    public void test_dp_001() {
        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        Assert.assertEquals(6, new MaxSubArray53().maxSubArrayDp(nums));
    }

    @Test
    public void test_dp_002() {
        int[] nums = {0};
        Assert.assertEquals(0, new MaxSubArray53().maxSubArrayDp(nums));
    }

    @Test
    public void test_dp_003() {
        int[] nums = {-100000};
        Assert.assertEquals(-100000, new MaxSubArray53().maxSubArrayDp(nums));
    }

    @Test
    public void test_dp_004() {
        int[] nums = {4, -5, 1, 3, -1, 4, -3, 1, -2};
        Assert.assertEquals(7, new MaxSubArray53().maxSubArrayDp(nums));
    }
}