package com.sylar.leetcode.dp;

import org.junit.Assert;
import org.junit.Test;

public class MaxSubArraySumTest {

	@Test
	public void subArraySum01() {
		MaxSubArraySum sas = new MaxSubArraySum();
		int[] nums = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
		Assert.assertEquals(6, sas.subArraySum(nums));
	}

	@Test
	public void subArraySum02() {
		MaxSubArraySum sas = new MaxSubArraySum();
		int[] nums = { -2, 1, -3, };
		Assert.assertEquals(1, sas.subArraySum(nums));
	}

	@Test
	public void subArraySum03() {
		MaxSubArraySum sas = new MaxSubArraySum();
		int[] nums = { 2, 1, -5, 4 };
		Assert.assertEquals(4, sas.subArraySum(nums));
	}
}