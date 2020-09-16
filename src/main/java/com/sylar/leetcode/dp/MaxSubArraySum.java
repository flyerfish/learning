package com.sylar.leetcode.dp;

public class MaxSubArraySum {
	public int subArraySum(int[] nums) {
		if (nums.length == 0) {
			return 0;
		}
		int[] dp = new int[nums.length];
		dp[0] = nums[0];
		int maxSum = dp[0];
		for (int i = 1; i < nums.length; ++i) {
			dp[i] = Math.max(dp[i - 1] + nums[i], nums[i]);
			if (maxSum < dp[i]) {
				maxSum = dp[i];
			}
		}
		return maxSum;
	}
}
