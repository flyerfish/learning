package com.sylar.leetcode;

import java.util.HashMap;
import java.util.Map;

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
