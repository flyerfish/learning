package com.sylar.leetcode.hash;

import org.junit.Assert;
import org.junit.Test;

public class Solution202Test {

	@Test
	public void isHappy() {
		Assert.assertEquals(true, new Solution202().isHappy(19));
	}

	@Test
	public void isHappy2() {
		Assert.assertEquals(true, new Solution202().isHappy(1111111));
	}

	@Test
	public void isHappy3() {
		Assert.assertEquals(false, new Solution202().isHappy(23456));
	}
}