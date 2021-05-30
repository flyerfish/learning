package com.chaos;

import org.junit.Assert;
import org.junit.Test;

public class HourseRobber213Test {

    @Test
    public void test_rob_001() {
        int[] nums = {2, 3, 2};
        HourseRobber213 hr = new HourseRobber213();
        Assert.assertEquals(3, hr.rob(nums));
    }

    @Test
    public void test_rob_002() {
        int[] nums = {1, 2, 3, 1};
        HourseRobber213 hr = new HourseRobber213();
        Assert.assertEquals(4, hr.rob(nums));
    }

    @Test
    public void test_rob_003() {
        int[] nums = {0};
        HourseRobber213 hr = new HourseRobber213();
        Assert.assertEquals(0, hr.rob(nums));
    }
}