package com.sylar.leetcode.hash;

import org.junit.Assert;

import junit.framework.TestCase;

public class Solution136Test extends TestCase {

	public void testSingleNumber() {
		int[] nums = {3, 4, 5, 3, 4};
		Assert.assertEquals(5, new Solution136().singleNumber(nums));
	}
}