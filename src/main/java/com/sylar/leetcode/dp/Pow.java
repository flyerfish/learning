package com.sylar.leetcode.dp;

//https://leetcode-cn.com/problems/powx-n/
public class Pow {
	public double myPow(double x, int n) {
		double res = 1;
		for (int i = Math.abs(n); i != 0; i = i / 2) {
			if (i % 2 == 1) {
				res = res * x;
			}
			x = x * x;
		}
		if (res == 1 && n != 0) {
			res = res * x;
		}
		if (n < 0) {
			return 1.0 / res;
		}
		return res;
	}
}
