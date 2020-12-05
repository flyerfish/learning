package com.sylar.leetcode.hash;

import java.util.HashMap;
import java.util.Map;

//编写一个算法来判断一个数 n 是不是快乐数。 
//
// 「快乐数」定义为：对于一个正整数，每一次将该数替换为它每个位置上的数字的平方和，然后重复这个过程直到这个数变为 1，也可能是 无限循环 但始终变不到 1。
//如果 可以变为 1，那么这个数就是快乐数。 
//
// 如果 n 是快乐数就返回 True ；不是，则返回 False 。 
//
// 
//
// 示例： 
//
// 输入：19
//输出：true
//解释：
//1^2 + 9^2 = 82
//8^2 + 2^2 = 68
//6^2 + 8^2 = 100
//1^2 + 0^2 + 0^2 = 1
// 
// Related Topics 哈希表 数学 
// 👍 492 👎 0
public class Solution202 {
	public boolean isHappy(int n) {
		Map<Integer, Integer> hash = new HashMap<>();
		while (true) {
			int newN = calc(n);
			if (newN == 1) {
				return true;
			}
			if (newN > 1 && newN < 10) {
				if (hash.containsKey(newN)) {
					return false;
				}
				hash.put(newN, newN);
			}
			n = newN;
		}
	}

	private int calc(int n) {
		int ret = n % 10;
		n = n / 10;
		int sum = 0;
		while (ret > 0 || n > 0) {
			sum += ret * ret;
			ret = n % 10;
			n = n / 10;
		}

		System.out.println(sum);
		return sum;
	}
}
