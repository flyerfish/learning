package com.sylar.leetcode.bfs;

import org.junit.Assert;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ShortestPathTest {

    @Test
    public void test_001_shortestPath() {
        ShortestPath sp = new ShortestPath();
        int[][] grid = {
                {0,0,0},
                {1,1,0},
                {0,0,0},
                {0,1,1},
                {0,0,0}
        };

        Assert.assertEquals(6, sp.shortestPath(grid, 1));
    }

    @Test
    public void test_002_shortestPath() {
        ShortestPath sp = new ShortestPath();
        int[][] grid = {
                {0,0,0},
                {1,1,0},
                {0,0,0},
                {0,1,1},
                {0,0,0}
        };

        Assert.assertEquals(10, sp.shortestPath(grid, 0));
    }

    @Test
    public void test_003_shortestPath() {
        ShortestPath sp = new ShortestPath();
        int[][] grid = {
                {0,1,1},
                {1,1,1},
                {1,0,0}
        };

        Assert.assertEquals(-1, sp.shortestPath(grid, 1));
    }

    @Test
    public void test_004_shortestPath() {
        ShortestPath sp = new ShortestPath();
        int[][] grid = {
                {0,1,1},
                {1,1,1},
                {1,0,0}
        };

        Assert.assertEquals(4, sp.shortestPath(grid, 2));
    }
}