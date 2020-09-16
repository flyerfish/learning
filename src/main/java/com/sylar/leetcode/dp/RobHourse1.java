package com.sylar.leetcode.dp;

import java.util.Arrays;

/**
 * test
 */
public class RobHourse1 {

	private int[] dp;

	public int rob(int[] nums) {
		// 初始化备忘录
		dp = new int[nums.length];
		Arrays.fill(dp, -1);
		// 强盗从第 0 间房子开始抢劫
		return dp(nums, 0);
	}

	// 返回 dp[start..] 能抢到的最大值
	private int dp(int[] nums, int start) {
		if (start >= nums.length) {
			return 0;
		}
		// 避免重复计算
		if (dp[start] != -1) {
			return dp[start];
		}

		// 记入备忘录
		dp[start] = Math.max(dp(nums, start + 1), nums[start] + dp(nums, start + 2));
		return dp[start];
	}
}
