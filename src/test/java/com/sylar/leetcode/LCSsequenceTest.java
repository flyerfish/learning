package com.sylar.leetcode;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class LCSsequenceTest {
    @Test
    public void testLongestCommonSubsequence(){
        LCSsequence lcs = new LCSsequence();
        Assert.assertEquals(3, lcs.longestCommonSubsequence("abc", "abc"));
    }

}