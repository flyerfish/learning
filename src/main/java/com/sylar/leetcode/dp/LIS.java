package com.sylar.leetcode.dp;

import java.util.Arrays;

/**
 * Leetcode: 673,300
 * https://leetcode-cn.com/problems/number-of-longest-increasing-subsequence/
 * https://leetcode-cn.com/problems/longest-increasing-subsequence/
 */

//给定一个未排序的整数数组，找到最长递增子序列的个数。
// 示例 1:
//输入: [1,3,5,4,7]
//输出: 2
//解释: 有两个最长递增子序列，分别是 [1, 3, 4, 7] 和[1, 3, 5, 7]。
//
// 示例 2:
//
//输入: [2,2,2,2,2]
//输出: 5
//解释: 最长递增子序列的长度是1，并且存在5个子序列的长度为1，因此输出5。
//
// 注意: 给定的数组长度不超过 2000 并且结果一定是32位有符号整数。
// Related Topics 动态规划
// 👍 308 👎 0

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

    // 给你一个整数数组 nums ，找到其中最长严格递增子序列的长度。
    // 子序列是由数组派生而来的序列，删除（或不删除）数组中的元素而不改变其余元素的顺序。
    // 例如，[3,6,2,7] 是数组 [0,3,1,6,2,2,7] 的子序列。
    // 示例 1：
    // 输入：nums = [10,9,2,5,3,7,101,18]
    // 输出：4
    // 解释：最长递增子序列是 [2,3,7,101]，因此长度为 4 。
    // 示例 2：
    //
    //输入：nums = [0,1,0,3,2,3]
    //输出：4
    //
    // 示例 3：
    // 输入：nums = [7,7,7,7,7,7,7]
    // 输出：1
    // 提示：
    //
    // 1 <= nums.length <= 2500
    // -104 <= nums[i] <= 104
    //
    // 进阶：
    // 你可以设计时间复杂度为 O(n2) 的解决方案吗？
    // 你能将算法的时间复杂度降低到 O(n log(n)) 吗?
    //
    // Related Topics 二分查找 动态规划
    // 👍 1618 👎 0
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
