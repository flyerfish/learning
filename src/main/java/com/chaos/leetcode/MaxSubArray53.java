package com.chaos.leetcode;

public class MaxSubArray53 {
    public int maxSubArrayDp(int[] nums) {
        int[] dp = new int[nums.length];
        dp[0] = nums[0];
        int maxSum = dp[0];
        for (int i = 1; i < nums.length; ++i) {
            dp[i] = Math.max(dp[i - 1] + nums[i], nums[i]);
            if (maxSum < dp[i]) {
                maxSum = dp[i];
            }
        }
        return maxSum;
    }


    public int maxSubArray(int[] nums) {
        int ans = nums[0];
        int sum = 0;
        for (int num : nums) {
            if (sum > 0) {
                sum += num;
            } else {
                sum = num;
            }
            ans = Math.max(ans, sum);
        }
        return ans;
    }
}
