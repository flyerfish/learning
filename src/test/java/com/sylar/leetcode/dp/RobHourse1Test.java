package com.sylar.leetcode.dp;

import org.junit.Assert;
import org.junit.Test;

public class RobHourse1Test {
	@Test
	public void test1() {
		RobHourse1 rh = new RobHourse1();
		int[] nums = { 5, 2, 6, 3, 1, 7 };
		Assert.assertEquals(18, rh.robByDp(nums));
	}

}