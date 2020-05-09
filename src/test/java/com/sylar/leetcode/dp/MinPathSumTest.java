package com.sylar.leetcode.dp;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class MinPathSumTest {

    @Test
    public void minPathSum() {
        MinPathSum mps = new MinPathSum();

        int[][] grid = {{1,3,1},{1,5,1},{4,2,1}};
        Assert.assertEquals(7, mps.minPathSum(grid) );
    }
}