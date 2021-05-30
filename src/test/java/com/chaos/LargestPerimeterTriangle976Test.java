package com.chaos;

import org.junit.Assert;
import org.junit.Test;

public class LargestPerimeterTriangle976Test {
    @Test
    public void test_001() {
        LargestPerimeterTriangle976 tpt = new LargestPerimeterTriangle976();
        int[] nums = {2, 1, 2};
        Assert.assertEquals(5, tpt.largestPerimeter(nums));
    }

    @Test
    public void test_002() {
        LargestPerimeterTriangle976 tpt = new LargestPerimeterTriangle976();
        int[] nums = {1, 2, 1};
        Assert.assertEquals(0, tpt.largestPerimeter(nums));
    }

    @Test
    public void test_003() {
        LargestPerimeterTriangle976 tpt = new LargestPerimeterTriangle976();
        int[] nums = {3, 2, 3, 4};
        Assert.assertEquals(10, tpt.largestPerimeter(nums));
    }

    @Test
    public void test_004() {
        LargestPerimeterTriangle976 tpt = new LargestPerimeterTriangle976();
        int[] nums = {3, 6, 2, 3};
        Assert.assertEquals(8, tpt.largestPerimeter(nums));
    }
}