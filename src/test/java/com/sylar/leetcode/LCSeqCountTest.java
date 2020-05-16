package com.sylar.leetcode;

import org.junit.Assert;
import org.junit.Test;

import java.util.LinkedList;
import java.util.List;

import static org.junit.Assert.*;

public class LCSeqCountTest {

    @Test
    public void test_001_getLcsCount() {
        LCSeqCount lcsCount = new LCSeqCount();
        Assert.assertEquals(3, lcsCount.getLcsCount("aaa", "ab"));
    }

    @Test
    public void test_002_getLcsCount() {
        LCSeqCount lcsCount = new LCSeqCount();
        Assert.assertEquals(2, lcsCount.getLcsCount("abcd", "bcad"));
    }

    @Test
    public void test_003_getLcsCount() {
        LCSeqCount lcsCount = new LCSeqCount();
        Assert.assertEquals(3, lcsCount.getLcsCount("abc", "cba"));
    }

    @Test
    public void test_004_getLcsCount() {
        LCSeqCount lcsCount = new LCSeqCount();
        Assert.assertEquals(2, lcsCount.getLcsCount("abcdefg", "fgabcde"));
    }

    @Test
    public void test_005_getLcsCount() {
        LCSeqCount lcsCount = new LCSeqCount();
        Assert.assertEquals(3, lcsCount.getLcsCount("abdgacfc", "dabcgacf"));
    }

    @Test
    public void test_001_getSubStr(){
        LCSeqCount lcsCount = new LCSeqCount();
        System.out.println(lcsCount.getSubStr("abcd").toString());
    }

    @Test
    public void test_002_getSubStr(){
        LCSeqCount lcsCount = new LCSeqCount();
        lcsCount.getSubStr("abcdefghijklmnopqrstuvwxyz");
    }

    @Test
    public void test_003_getSubStr(){
        LCSeqCount lcsCount = new LCSeqCount();
        System.out.println(lcsCount.getSubStr("abc").toString());

        List<Character> stack = new LinkedList<>();
        stack.add('a');
        stack.add('b');
        System.out.println(stack.toString());
    }
}