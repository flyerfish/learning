package com.sylar.leetcode.dp;

public class RobHourse2 {
    public int rob2(int[] nums) {
        int n = nums.length;
        if (n == 1) return nums[0];
        return Math.max(robRange2(nums, 0, n - 2),
                robRange2(nums, 1, n - 1));
    }

    // 仅计算闭区间 [start,end] 的最优结果
    int robRange2(int[] nums, int start, int end) {
        int dp_i_1 = 0;
        int dp_i_2 = 0;
        int dp_i = 0;
        for (int i = end; i >= start; i--) {
            dp_i = Math.max(dp_i_1, nums[i] + dp_i_2);
            dp_i_2 = dp_i_1;
            dp_i_1 = dp_i;
        }
        return dp_i;
    }

    public int rob(int[] nums) {
        int n = nums.length;
        if( n <= 0 ){
            return 0;
        }else if(n == 1){
            return nums[0];
        }

        return Math.max( robRange(nums,0, n-2), robRange( nums,1, n-1));
    }

    int robRange(int[] nums, int start, int end) {
        int dp_i_1 = 0;
        int dp_i_2 = 0;
        int dp_i = 0;
        for( int i = end; i >= start; --i ){
            dp_i = Math.max(dp_i_1, nums[i] + dp_i_2);
            dp_i_2 = dp_i_1;
            dp_i_1 = dp_i;
        }
        return dp_i;
    }
}
