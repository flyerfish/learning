package com.sylar.leetcode.hash;

import org.junit.Assert;
import org.junit.Test;

public class TwoSumTest {

    @Test
    public void twoSum() {
        TwoSum s1 = new TwoSum();
        int[] nums = {2, 7, 11, 15};
        Assert.assertArrayEquals(new int[]{0, 1}, s1.twoSum(nums, 9));
    }

    @Test
    public void twoSum2() {
        TwoSum s1 = new TwoSum();
        int[] nums = {2, 7, 11, 15};
        Assert.assertArrayEquals(new int[]{0, 1}, s1.twoSum2(nums, 9));
    }
}