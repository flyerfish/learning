package com.sylar.leetcode;

import org.junit.Assert;
import org.junit.Test;

public class CoinChangeTest {

    @Test
    public void testChangle(){
        CoinChange cc = new CoinChange();
        Assert.assertEquals(4, cc.change(5, new int[]{1,2,5}));
    }

    @Test
    public void testChangle2(){
        CoinChange cc = new CoinChange();
        Assert.assertEquals(0, cc.change(3, new int[]{2}));
    }

    @Test
    public void testChangle3(){
        CoinChange cc = new CoinChange();
        Assert.assertEquals(1, cc.change(10, new int[]{10}));
    }

    @Test
    public void testChangle4(){
        CoinChange cc = new CoinChange();
        Assert.assertEquals(4, cc.change(5, new int[]{1,2,5,6}));
    }

    @Test
    public void testChangle5(){
        CoinChange cc = new CoinChange();
        Assert.assertEquals(4563, cc.change(100, new int[]{1,2,5,10,20,50,100}));
    }
}