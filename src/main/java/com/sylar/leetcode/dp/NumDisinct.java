package com.sylar.leetcode.dp;

import java.util.Arrays;

//https://leetcode-cn.com/problems/distinct-subsequences/
public class NumDisinct {
	public int numDistinct(String s, String t) {
		int[][] dp = new int[t.length() + 1][s.length() + 1];
		for (int j = 0; j < s.length() + 1; j++) {
			dp[0][j] = 1;
		}

		for (int i = 1; i < t.length() + 1; i++) {
			for (int j = 1; j < s.length() + 1; j++) {
				if (t.charAt(i - 1) == s.charAt(j - 1)) {
					dp[i][j] = dp[i - 1][j - 1] + dp[i][j - 1];
				} else {
					dp[i][j] = dp[i][j - 1];
				}
			}
		}
		return dp[t.length()][s.length()];
	}

	public int distinctSubseqII(String str) {
		int MOD_NUM = 1000000007;
		int len = str.length();
		int[] dp = new int[len + 1];
		dp[0] = 1;

		int[] last = new int[26];
		Arrays.fill(last, -1);

		for (int i = 0; i < len; ++i) {
			int x = str.charAt(i) - 'a';
			dp[i + 1] = dp[i] * 2 % MOD_NUM;
			if (last[x] >= 0) {
				dp[i + 1] -= dp[last[x]];
			}
			dp[i + 1] %= MOD_NUM;
			last[x] = i;
		}

		dp[len]--;
		if (dp[len] < 0) {
			dp[len] += MOD_NUM;
		}
		return dp[len];
	}
}
