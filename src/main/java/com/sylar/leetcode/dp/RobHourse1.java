package com.sylar.leetcode.dp;

import java.util.Arrays;

/**
 * test
 */
public class RobHourse1 {

    private int[] memo;

    public int rob(int[] nums) {
        // 初始化备忘录
        memo = new int[nums.length];
        Arrays.fill(memo, -1);
        // 强盗从第 0 间房子开始抢劫
        return dp(nums, 0);
    }

    // 返回 dp[start..] 能抢到的最大值
    private int dp(int[] nums, int start) {
        if (start >= nums.length) {
            return 0;
        }
        // 避免重复计算
        if (memo[start] != -1) {
            return memo[start];
        }

        // 记入备忘录
        memo[start] = Math.max(dp(nums, start + 1), nums[start] + dp(nums, start + 2));
        return memo[start];
    }
}
