package com.sylar.leetcode.dp;

import org.junit.Assert;
import org.junit.Test;

public class LCSsequenceTest {
	@Test
	public void testLongestCommonSubsequence() {
		LCSsequence lcs = new LCSsequence();
		Assert.assertEquals(3, lcs.longestCommonSubsequence("abc", "abc"));
	}

	@Test
	public void testLongestCommonSubsequence2() {
		LCSsequence lcs = new LCSsequence();
		Assert.assertEquals(5, lcs.longestCommonSubsequence("abcabcb"));
	}
}