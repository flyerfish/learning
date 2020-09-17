package com.sylar.leetcode.dp;

import org.junit.Assert;
import org.junit.Test;

public class MaxSubArrayProductTest {

	@Test
	public void maxProduct() {
		int[] nums = { -2, 3, -4 };
		MaxSubArrayProduct map = new MaxSubArrayProduct();
		Assert.assertEquals(24, map.maxProduct(nums));
	}
}