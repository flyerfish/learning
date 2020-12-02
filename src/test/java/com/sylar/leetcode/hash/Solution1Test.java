package com.sylar.leetcode.hash;

import org.junit.Assert;
import org.junit.Test;

public class Solution1Test {

    @Test
    public void twoSum() {
        Solution1 s1 = new Solution1();
        int[] nums = {2,7,11,15};
        Assert.assertArrayEquals(new int[]{0,1}, s1.twoSum(nums, 9));
    }
}