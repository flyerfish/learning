package com.sylar.leetcode.dp;

import java.util.Arrays;

/**
 * LeetCode：198
 * https://leetcode-cn.com/problems/house-robber/
 */
public class RobHourse1 {

	private int[] dp;

	public int rob(int[] nums) {
		// 初始化备忘录
		dp = new int[nums.length];
		Arrays.fill(dp, -1);
		// 强盗从第 0 间房子开始抢劫
		return robByDp(nums, 0);
	}

	// 返回 dp[start..] 能抢到的最大值
	private int robByDp(int[] nums, int start) {
		if (start >= nums.length) {
			return 0;
		}
		// 避免重复计算
		if (dp[start] != -1) {
			return dp[start];
		}

		// 记入备忘录
		dp[start] = Math.max(robByDp(nums, start + 1), nums[start] + robByDp(nums, start + 2));
		return dp[start];
	}

	public int robByDp(int[] nums) {
		if (nums.length == 0) {
			return 0;
		} else if (nums.length == 1) {
			return nums[0];
		}
		int[] dp = new int[nums.length];
		Arrays.fill(dp, 0);
		dp[0] = nums[0];
		dp[1] = Math.max(nums[0], nums[1]);
		for (int i = 2; i < nums.length; ++i) {
			dp[i] = Math.max(dp[i - 1], nums[i] + dp[i - 2]);
		}
		return dp[nums.length - 1];
	}
}
