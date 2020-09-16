package com.sylar.leetcode.dp;

public class ClimbStars {
	int climbStars(int n) {
		if (n == 1 || n == 2) {
			return n;
		}

		return climbStars(n - 1) + climbStars(n - 2);
	}

	int climbStarsByDp(int n) {
		int[] dp = new int[n + 3];
		dp[1] = 1;
		dp[2] = 2;
		for (int i = 3; i <= n; ++i) {
			dp[i] = dp[i - 1] + dp[i - 2];
		}
		return dp[n];
	}
}
