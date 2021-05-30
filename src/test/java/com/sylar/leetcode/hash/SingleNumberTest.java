package com.sylar.leetcode.hash;

import junit.framework.TestCase;
import org.junit.Assert;

public class SingleNumberTest extends TestCase {

    public void testSingleNumber() {
        int[] nums = {3, 4, 5, 3, 4};
        Assert.assertEquals(5, new SingleNumber().singleNumber(nums));
    }
}