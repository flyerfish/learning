package com.chaos;

import java.util.Arrays;

public class HourseRobber213 {
    private int[] memo;


    public int rob(int[] nums) {
        if (nums.length == 1) {
            return nums[0];
        }

        memo = new int[nums.length];
        Arrays.fill(memo, -1);
        int res1 = robByDp(nums, 0, nums.length - 2);
        Arrays.fill(memo, -1);
        int res2 = robByDp(nums, 1, nums.length - 1);

        return Math.max(res1, res2);
    }

    private int robByDp(int[] nums, int start, int end) {
        if (start > end) {
            return 0;
        }

        if (memo[start] != -1) {
            return memo[start];
        }

        memo[start] = Math.max(robByDp(nums, start + 2, end) + nums[start], robByDp(nums, start + 1, end));
        return memo[start];
    }
}
