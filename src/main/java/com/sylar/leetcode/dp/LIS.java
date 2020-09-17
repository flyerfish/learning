package com.sylar.leetcode.dp;

import java.util.Arrays;

//https://leetcode-cn.com/problems/number-of-longest-increasing-subsequence/
//
public class LIS {
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

	public int findNumberOfLIS(int[] nums) {
		int numsLen = nums.length;
		if (numsLen <= 1) {
			return numsLen;
		}
		int[] lengths = new int[numsLen]; // lengths[i] = length of longest ending in nums[i]
		int[] counts = new int[numsLen]; // count[i] = number of longest ending in nums[i]
		Arrays.fill(counts, 1);

		for (int j = 0; j < numsLen; ++j) {
			for (int i = 0; i < j; ++i) {
				if (nums[i] < nums[j]) {
					if (lengths[i] >= lengths[j]) {
						lengths[j] = lengths[i] + 1;
						counts[j] = counts[i];
					} else if (lengths[i] + 1 == lengths[j]) {
						counts[j] += counts[i];
					}
				}
			}
		}

		int longest = 0;
		int ans = 0;
		for (int length : lengths) {
			longest = Math.max(longest, length);
		}
		for (int i = 0; i < numsLen; ++i) {
			if (lengths[i] == longest) {
				ans += counts[i];
			}
		}
		return ans;
	}
}
