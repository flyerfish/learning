package com.sylar.leetcode;

import org.junit.Assert;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RemoveDuplicateLettersTest {

    @Test
    public void test_001_removeDuplicateLetters() {
        RemoveDuplicateLetters rd = new RemoveDuplicateLetters();
        Assert.assertEquals("abc", rd.removeDuplicateLetters("bcabc"));
    }

    @Test
    public void test_002_removeDuplicateLetters() {
        RemoveDuplicateLetters rd = new RemoveDuplicateLetters();
        Assert.assertEquals("acdb", rd.removeDuplicateLetters("cbacdcbc"));
    }
}