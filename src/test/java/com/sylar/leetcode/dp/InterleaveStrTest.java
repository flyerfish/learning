package com.sylar.leetcode.dp;

import org.junit.Assert;
import org.junit.Test;

public class InterleaveStrTest {

	@Test
	public void test_01() {
		UniquePaths.InterleaveStr is = new UniquePaths.InterleaveStr();
		Assert.assertEquals(true, is.isInterleave("aabcc", "dbbca", "aadbbcbcac"));
	}

	@Test
	public void test_02() {
		UniquePaths.InterleaveStr is = new UniquePaths.InterleaveStr();
		Assert.assertEquals(false, is.isInterleave("aabcc", "dbbca", "aadbbbaccc"));
	}

}