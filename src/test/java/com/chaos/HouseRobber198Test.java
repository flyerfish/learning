package com.chaos;

import org.junit.Assert;
import org.junit.Test;

public class HouseRobber198Test {

    @Test
    public void test_rob_001() {
        int[] nums = {1, 2, 3, 1};
        HouseRobber198 hr = new HouseRobber198();
        Assert.assertEquals(4, hr.rob(nums));
    }

    @Test
    public void test_rob_002() {
        int[] nums = {2, 7, 9, 3, 1};
        HouseRobber198 hr = new HouseRobber198();
        Assert.assertEquals(12, hr.rob(nums));
    }
}