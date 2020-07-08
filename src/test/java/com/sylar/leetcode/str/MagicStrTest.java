package com.sylar.leetcode.str;

import org.junit.Assert;
import org.junit.Test;

public class MagicStrTest {
    @Test
    public void test_01() {
        MagicStr magicStr = new MagicStr();
        Assert.assertEquals(3, magicStr.magicalString(6));
    }

    @Test
    public void test_02() {
        MagicStr magicStr = new MagicStr();
        Assert.assertEquals(1, magicStr.magicalString(1));
    }

    @Test
    public void test_03() {
        MagicStr magicStr = new MagicStr();
        Assert.assertEquals(1, magicStr.magicalString(3));
    }
}