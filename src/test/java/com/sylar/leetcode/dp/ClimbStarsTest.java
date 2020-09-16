package com.sylar.leetcode.dp;

import org.junit.Assert;
import org.junit.Test;

public class ClimbStarsTest {

	@Test
	public void test() {
		ClimbStars cs = new ClimbStars();
		Assert.assertEquals(1, cs.climbStars(1));
		Assert.assertEquals(2, cs.climbStars(2));
		Assert.assertEquals(3, cs.climbStars(3));
		Assert.assertEquals(5, cs.climbStars(4));
		Assert.assertEquals(89, cs.climbStars(10));
		Assert.assertEquals(233, cs.climbStars(12));
	}

	@Test
	public void test2() {
		ClimbStars cs = new ClimbStars();
		Assert.assertEquals(89, cs.climbStarsByDp(10));
		Assert.assertEquals(233, cs.climbStarsByDp(12));
		Assert.assertEquals(10946, cs.climbStarsByDp(20));
	}
}