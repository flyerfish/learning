package com.sylar.leetcode.dfs;

import org.junit.Assert;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class IslandCountTest {

    @Test
    public void test_001_numIslands() {
        IslandCount ic = new IslandCount();
        char[][] island = {
                {'1','1','1','1','0'},
                {'1','1','0','1','0'},
                {'1','1','0','0','0'},
                {'0','0','0','0','0'}
        };
        Assert.assertEquals(1, ic.numIslands(island));
    }

    @Test
    public void test_002_numIslands() {
        IslandCount ic = new IslandCount();
        char[][] island = {
                {'1','1','0','0','0'},
                {'1','1','0','0','0'},
                {'0','0','1','0','0'},
                {'0','0','0','1','1'}
        };
        Assert.assertEquals(3, ic.numIslands(island));
    }
}