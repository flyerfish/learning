package com.sylar.leetcode.str;

import org.junit.Assert;
import org.junit.Test;

public class MatchingSubseqTest {

    @Test
    public void test_match1() {
        MatchingSubseq msq = new MatchingSubseq();
        String[] words = {"a", "bb", "acd", "ace"};
        Assert.assertEquals(3, msq.numMatchingSubseq("abcde", words));
    }

    @Test
    public void test_matchWay2() {
        MatchingSubseq msq = new MatchingSubseq();
        String[] words = {"a", "bb", "acd", "ace"};
        Assert.assertEquals(3, msq.numMatchingSubseq2("abcde", words));
    }
}
