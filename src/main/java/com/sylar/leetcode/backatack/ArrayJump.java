package com.sylar.leetcode.backatack;

public class ArrayJump {
	public boolean canJump(int[] nums) {
		int rightMost = 0;
		for (int i = 0; i < nums.length; ++i) {
			if (i > rightMost) {
				continue;
			}
			rightMost = Math.max(rightMost, i + nums[i]);
			if (rightMost >= nums.length - 1) {
				return true;
			}
		}
		return false;
	}
}
