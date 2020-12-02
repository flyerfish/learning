package com.sylar.leetcode.hash;

import java.util.HashMap;
import java.util.Map;

//给定一个整数数组 nums 和一个目标值 target，请你在该数组中找出和为目标值的那 两个 整数，并返回他们的数组下标。
//
// 你可以假设每种输入只会对应一个答案。但是，数组中同一个元素不能使用两遍。
//
//
//
// 示例:
//
// 给定 nums = [2, 7, 11, 15], target = 9
//
//因为 nums[0] + nums[1] = 2 + 7 = 9
//所以返回 [0, 1]
//
// Related Topics 数组 哈希表
// 👍 9744 👎 0

public class Solution1 {
	public int[] twoSum(int[] nums, int target) {
		Map<Integer, Integer> data = new HashMap<>();
		for (int i = 0; i < nums.length; ++i) {
			data.put(nums[i], i);
		}

		int[] ret = new int[2];

		for (int i = 0; i < nums.length; ++i) {
			int left = target - nums[i];
			if (data.containsKey(left)) {
				if (data.get(left) != i) {
					ret[0] = i;
					ret[1] = data.get(left);
					return ret;
				}
			}
		}

		return new int[0];
	}
}
