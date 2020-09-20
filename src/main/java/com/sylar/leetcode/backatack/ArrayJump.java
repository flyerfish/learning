package com.sylar.leetcode.backatack;

public class ArrayJump {
	public boolean canJump(int[] nums) {
		int reach = 0;
		for (int i = 0; i < nums.length; ++i) {
			if (i > reach) {
				continue;
			}
			reach = Math.max(reach, i + nums[i]);
			if (reach >= nums.length - 1) {
				return true;
			}
		}
		return false;
	}

	public boolean canJump2(int[] nums) {
		int reach = 0;
		int size = nums.length;
		for (int i = 0; i <= reach && reach < size - 1; ++i) {
			reach = Math.max(i + nums[i], reach);
		}
		return reach >= nums.length - 1;
	}
}
