package com.sylar.leetcode;

import org.junit.Assert;
import org.junit.Test;

public class BracketMatchTest {

    @Test
    public void test_01_isValid(){
        BracketMatch bm = new BracketMatch();

        Assert.assertEquals(true, bm.isValid("()"));
    }

    @Test
    public void test_02_isValid(){
        BracketMatch bm = new BracketMatch();

        Assert.assertEquals(true, bm.isValid("()[]{}"));
    }

    @Test
    public void test_03_isValid(){
        BracketMatch bm = new BracketMatch();

        Assert.assertEquals(false, bm.isValid("(]"));
    }

    @Test
    public void test_04_isValid(){
        BracketMatch bm = new BracketMatch();

        Assert.assertEquals(false, bm.isValid("([)]"));
    }

    @Test
    public void test_05_isValid(){
        BracketMatch bm = new BracketMatch();

        Assert.assertEquals(true, bm.isValid("{[]}"));
    }
}