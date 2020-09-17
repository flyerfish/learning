package com.sylar.leetcode.dp;

import java.util.Arrays;
import java.util.Comparator;

public class MaxEnvelopes {
	public int maxEnvelopes(int[][] envelopes) {
		int n = envelopes.length;
		// 按宽度升序排列，如果宽度一样，则按高度降序排列
		Arrays.sort(envelopes, new Comparator<>() {
			@Override
			public int compare(int[] a, int[] b) {
				return a[0] == b[0] ? b[1] - a[1] : a[0] - b[0];
			}
		});
		// 对高度数组寻找 LIS
		int[] height = new int[n];
		for (int i = 0; i < n; i++) {
			height[i] = envelopes[i][1];
		}

		return lengthOfLIS(height);
	}

	/* 返回 nums 中 LIS 的长度 */
	public int lengthOfLIS(int[] nums) {
		if (nums.length == 0) {
			return 0;
		}
		int[] dp = new int[nums.length];
		dp[0] = 1;
		int maxans = 1;
		for (int i = 1; i < dp.length; i++) {
			int maxval = 0;
			for (int j = 0; j < i; j++) {
				if (nums[i] > nums[j]) {
					maxval = Math.max(maxval, dp[j]);
				}
			}
			dp[i] = maxval + 1;
			maxans = Math.max(maxans, dp[i]);
		}
		return maxans;
	}
}
