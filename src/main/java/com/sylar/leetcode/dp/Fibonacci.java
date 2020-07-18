package com.sylar.leetcode.dp;

public class Fibonacci {
	public int fib(int n) {
		int[] dp = new int[n + 1];
		return calcFibByDp(dp, n);
	}

	private long calcFib(long n) {
		if (n == 0) {
			return 0;
		} else if (n == 1) {
			return 1;
		} else {
			return calcFib(n - 1) + calcFib(n - 2);
		}
	}

	private int calcFibByDp(int[] dp, int n) {
		if (n == 0) {
			return 0;
		}
		if (n == 1) {
			return 1;
		}

		if (dp[n] != 0) {
			return dp[n];
		}
		dp[n] = (calcFibByDp(dp, n - 1) + calcFibByDp(dp, n - 2)) % 1000000007;
		return dp[n];
	}
}
