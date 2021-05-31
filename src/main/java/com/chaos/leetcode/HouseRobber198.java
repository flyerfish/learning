package com.chaos.leetcode;

import java.util.Arrays;

public class HouseRobber198 {
    private int[] memo;

    public int rob(int[] nums) {
        memo = new int[nums.length];
        Arrays.fill(memo, -1);
        return robByDp(nums);
    }

    private int robByDp(int[] nums, int n) {
        if (n >= nums.length) {
            return 0;
        }

        if (memo[n] != -1) {
            return memo[n];
        }

        int res1 = robByDp(nums, n + 2) + nums[n];
        int res2 = robByDp(nums, n + 1);
        memo[n] = Math.max(res1, res2);
        return memo[n];
    }

    private int robByDp(int[] nums) {
        if (null == nums || nums.length == 0) {
            return 0;
        }
        if (nums.length == 1) {
            return nums[0];
        }
        int[] dp = new int[nums.length];
        Arrays.fill(dp, 0);
        dp[0] = nums[0];
        dp[1] = Math.max(nums[0], nums[1]);
        for (int i = 2; i < nums.length; ++i) {
            dp[i] = Math.max(dp[i - 2] + nums[i], dp[i - 1]);
        }
        return dp[nums.length - 1];
    }
}
