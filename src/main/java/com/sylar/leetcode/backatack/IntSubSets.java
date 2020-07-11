package com.sylar.leetcode.backatack;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class IntSubSets {
    List<List<Integer>> res = new ArrayList<>();

    List<List<Integer>> subsets(int[] nums) {
        // 记录走过的路径
        LinkedList<Integer> track = new LinkedList<>();
        backtrack(nums, 0, track);
        return res;
    }

    void backtrack(int[] nums, int start, LinkedList<Integer> track) {
        res.add(new LinkedList<>(track));
        // 注意 i 从 start 开始递增
        for (int i = start; i < nums.length; i++) {
            // 做选择
            track.addLast(nums[i]);
            // 回溯
            backtrack(nums, i + 1, track);
            // 撤销选择
            track.removeLast();
        }
    }
}
