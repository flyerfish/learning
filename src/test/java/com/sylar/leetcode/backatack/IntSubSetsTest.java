package com.sylar.leetcode.backatack;

import org.junit.Test;

public class IntSubSetsTest {

    @Test
    public void subsets() {
        IntSubSets iss = new IntSubSets();
        int[] nums = {1, 2, 3};
        System.out.println(iss.subsets(nums));
    }
}