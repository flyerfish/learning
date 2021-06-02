package com.chaos.leetcode;

import org.junit.Assert;
import org.junit.Test;

public class NumberOfIslands200Test {
    @Test
    public void test_001_numIslands() {
        NumberOfIslands200 ic = new NumberOfIslands200();
        char[][] island = {
            {'1', '1', '1', '1', '0'},
            {'1', '1', '0', '1', '0'},
            {'1', '1', '0', '0', '0'},
            {'0', '0', '0', '0', '0'}
        };
        Assert.assertEquals(1, ic.numIslands(island));
    }

    @Test
    public void test_002_numIslands() {
        NumberOfIslands200 ic = new NumberOfIslands200();
        char[][] island = {
            {'1', '1', '0', '0', '0'},
            {'1', '1', '0', '0', '0'},
            {'0', '0', '1', '0', '0'},
            {'0', '0', '0', '1', '1'}
        };
        Assert.assertEquals(3, ic.numIslands(island));
    }
}