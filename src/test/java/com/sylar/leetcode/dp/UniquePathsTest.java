package com.sylar.leetcode.dp;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class UniquePathsTest {

    @Test
    public void test_001_uniquePaths() {
        UniquePaths ups = new UniquePaths();
        Assert.assertEquals(3, ups.uniquePaths(3,2));
    }

    @Test
    public void test_002_uniquePaths() {
        UniquePaths ups = new UniquePaths();
        Assert.assertEquals(28, ups.uniquePaths(7,3));
    }

    @Test
    public void test_003_uniquePaths() {
        UniquePaths ups = new UniquePaths();
        Assert.assertEquals(1596692176, ups.uniquePaths(50,100));
    }

    @Test
    public void uniquePathsWithObstacles() {
    }
}