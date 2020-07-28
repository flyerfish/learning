package com.sylar.leetcode.backatack;

import org.junit.Assert;
import org.junit.Test;

public class ArrayJumpTest {

	@Test
	public void canJump1() {
		ArrayJump aj = new ArrayJump();
		int[] sums = { 1, 0, 2 };
		Assert.assertEquals(false, aj.canJump(sums));
	}

	@Test
	public void canJump2() {
		ArrayJump aj = new ArrayJump();
		int[] sums = { 1 };
		Assert.assertEquals(true, aj.canJump(sums));
	}

	@Test
	public void canJump3() {
		ArrayJump aj = new ArrayJump();
		int[] sums = { 2, 0 };
		Assert.assertEquals(true, aj.canJump(sums));
	}

	@Test
	public void canJump4() {
		ArrayJump aj = new ArrayJump();
		int[] sums = { 2, 3, 1, 1, 4 };
		Assert.assertEquals(true, aj.canJump(sums));
	}

	@Test
	public void canJump5() {
		ArrayJump aj = new ArrayJump();
		int[] sums = { 3, 2, 1, 0, 4 };
		Assert.assertEquals(false, aj.canJump(sums));
	}
}