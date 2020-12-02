package com.sylar.leetcode.hash;

import java.util.HashMap;
import java.util.Map;

//给定一个非空整数数组，除了某个元素只出现一次以外，其余每个元素均出现两次。找出那个只出现了一次的元素。
//
// 说明：
//
// 你的算法应该具有线性时间复杂度。 你可以不使用额外空间来实现吗？
//
// 示例 1:
//
// 输入: [2,2,1]
//输出: 1
//
//
// 示例 2:
//
// 输入: [4,1,2,1,2]
//输出: 4
// Related Topics 位运算 哈希表
// 👍 1603 👎 0
public class Solution136 {
    public int singleNumber2(int[] nums) {
        Map<Integer, Integer> numsMap = new HashMap<>();
        for (int i = 0; i < nums.length; ++i) {
            if (numsMap.containsKey(nums[i])) {
                numsMap.put(nums[i], 2);
            } else {
                numsMap.put(nums[i], 1);
            }
        }

        for (Map.Entry<Integer, Integer> kv : numsMap.entrySet()) {
            if (kv.getValue() == 1) {
                return kv.getKey();
            }
        }

        return -1;
    }

    public int singleNumber(int[] nums) {
        int ret = 0;
        for(int num: nums) {
            ret ^= num;
        }
        return ret;
    }
}
