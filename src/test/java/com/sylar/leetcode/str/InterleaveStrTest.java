package com.sylar.leetcode.str;

import org.junit.Assert;
import org.junit.Test;

public class InterleaveStrTest {

    @Test
    public void test_01() {
        InterleaveStr is = new InterleaveStr();
        Assert.assertEquals(true, is.isInterleave("aabcc", "dbbca", "aadbbcbcac"));
    }

    @Test
    public void test_02() {
        InterleaveStr is = new InterleaveStr();
        Assert.assertEquals(false, is.isInterleave("aabcc", "dbbca", "aadbbbaccc"));
    }

}