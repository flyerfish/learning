package com.sylar.leetcode.dp;

public class LongestPalindrome {
	public String longestPalindrome(String s) {
		if (s.length() < 2) {
			return s;
		}

		int maxLen = 1;
		int begin = 0;
		boolean[][] dp = new boolean[s.length()][s.length()];
		for (int i = 0; i < s.length(); ++i) {
			dp[i][i] = true;
		}

		char[] charArray = s.toCharArray();
		for (int j = 1; j < s.length(); ++j) {
			for (int i = 0; i < j; ++i) {
				if (charArray[i] != charArray[j]) {
					dp[i][j] = false;
				} else {
					if (j - i < 3) {
						dp[i][j] = true;
					} else {
						dp[i][j] = dp[i + 1][j - 1];
					}
				}

				if (dp[i][j] && j - i + 1 > maxLen) {
					maxLen = j - i + 1;
					begin = i;
				}
			}
		}

		return s.substring(begin, begin + maxLen);
	}
}
