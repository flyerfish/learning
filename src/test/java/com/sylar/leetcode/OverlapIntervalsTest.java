package com.sylar.leetcode;

import org.junit.Assert;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class OverlapIntervalsTest {

    @Test
    public void test_001_intervalSchedule() {
        int[][] intervals = {{1,2},{2,3},{3,4},{1,4}};
        OverlapIntervals oi = new OverlapIntervals();
        Assert.assertEquals(1, oi.eraseOverlapIntervals(intervals));
    }

    @Test
    public void test_002_intervalSchedule() {
        int[][] intervals = {{1,2},{1,2},{1,2},{1,2}};
        OverlapIntervals oi = new OverlapIntervals();
        Assert.assertEquals(3, oi.eraseOverlapIntervals(intervals));
    }

    @Test
    public void test_003_intervalSchedule() {
        int[][] intervals = {{1,2},{2,3}};
        OverlapIntervals oi = new OverlapIntervals();
        Assert.assertEquals(0, oi.eraseOverlapIntervals(intervals));
    }
}