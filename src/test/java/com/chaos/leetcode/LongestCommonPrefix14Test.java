package com.chaos.leetcode;

import org.junit.Assert;
import org.junit.Test;

public class LongestCommonPrefix14Test {
    @Test
    public void test_001() {
        String[] strs = {"flower", "flow", "flight"};
        LongestCommonPrefix14 lcp = new LongestCommonPrefix14();
        Assert.assertEquals("fl", lcp.longestCommonPrefix(strs));
    }

    @Test
    public void test_002() {
        String[] strs = {"dog", "racecar", "car"};
        LongestCommonPrefix14 lcp = new LongestCommonPrefix14();
        Assert.assertEquals("", lcp.longestCommonPrefix(strs));
    }
}