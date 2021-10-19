package com.chaos.leetcode;

// https://leetcode-cn.com/problems/remove-element/

public class RemoveElement27 {
    public int removeElement(int[] nums, int val) {
        if (nums.length <= 0) {
            return 0;
        }
        int pos = 0;
        for (int i = 0; i < nums.length; ++i) {
            if (nums[i] != val) {
                nums[pos] = nums[i];
                pos = pos + 1;
            }
        }

        return pos;
    }
}
