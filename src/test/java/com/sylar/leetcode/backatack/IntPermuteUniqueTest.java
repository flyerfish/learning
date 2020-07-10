package com.sylar.leetcode.backatack;

import org.junit.Test;

public class IntPermuteUniqueTest {
    @Test
    public void test_01() {
        IntPermuteUnique apu = new IntPermuteUnique();
        int[] nums = {1, 1, 2, 3};
        System.out.println(apu.permute(nums));
    }
}