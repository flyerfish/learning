package com.chaos;

import org.junit.Assert;
import org.junit.Test;

public class RectangleArea223Test {

    @Test
    public void test_001() {
        int ax1 = -3, ay1 = 0, ax2 = 3, ay2 = 4, bx1 = 0, by1 = -1, bx2 = 9, by2 = 2;

        RectangleArea223 ca = new RectangleArea223();
        Assert.assertEquals(45, ca.computeArea(ax1, ay1, ax2, ay2, bx1, by1, bx2, by2));
    }

    @Test
    public void test_002() {
        int ax1 = -2, ay1 = -2, ax2 = 2, ay2 = 2, bx1 = -2, by1 = -2, bx2 = 2, by2 = 2;

        RectangleArea223 ca = new RectangleArea223();
        Assert.assertEquals(16, ca.computeArea(ax1, ay1, ax2, ay2, bx1, by1, bx2, by2));
    }
}