package com.sylar.leetcode.dp;

/**
 * https://leetcode-cn.com/problems/longest-palindromic-substring/
 */
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

	public String longestPalindrome2(String s) {
		if (s == null || s.length() < 1) {
			return "";
		}
		int start = 0;
		int end = 0;
		for (int i = 0; i < s.length(); i++) {
			int len1 = expandAroundCenter(s, i, i);
			int len2 = expandAroundCenter(s, i, i + 1);
			int len = Math.max(len1, len2);
			if (len > end - start) {
				start = i - (len - 1) / 2;
				end = i + len / 2;
			}
		}
		return s.substring(start, end + 1);
	}

	private int expandAroundCenter(String s, int left, int right) {
		char[] cs = s.toCharArray();
		while (left >= 0 && right < s.length() && cs[left] == cs[right]) {
			left--;
			right++;
		}
		return right - left - 1;
	}
}
