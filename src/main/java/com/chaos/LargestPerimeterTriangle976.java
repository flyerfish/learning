package com.chaos;

import static java.util.Arrays.sort;

// https://leetcode-cn.com/problems/largest-perimeter-triangle/
public class LargestPerimeterTriangle976 {
    public int largestPerimeter(int[] nums) {
        sort(nums);
        int len = nums.length;
        if (len < 3) {
            return 0;
        }

        for (int i = len - 1; i >= 2; --i) {
            if (nums[i] < nums[i - 1] + nums[i - 2]) {
                return nums[i] + nums[i - 1] + nums[i - 2];
            }
        }

        return 0;
    }
}
