package com.sylar.leetcode.backatack;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * @author sniper
 */
public class IntPermuteUnique {
    List<List<Integer>> res = new LinkedList<>();

    public List<List<Integer>> permute(int[] nums) {
        Arrays.sort(nums);
        boolean[] visit = new boolean[nums.length];
        // 记录「路径」
        LinkedList<Integer> track = new LinkedList<>();
        backtrack(nums, visit, track);
        return res;
    }

    private void backtrack(int[] nums, boolean[] visit, LinkedList<Integer> track) {
        // 触发结束条件
        if (track.size() == nums.length) {
            res.add(new LinkedList(track));
            return;
        }

        for (int i = 0; i < nums.length; i++) {
            if (visit[i] == true) {
                continue;
            }
            if (i > 0 && nums[i] == nums[i - 1] && visit[i - 1] == true) {
                continue;
            }
            // 做选择
            visit[i] = true;
            track.add(nums[i]);
            // 进入下一层决策树
            backtrack(nums, visit, track);
            // 取消选择
            track.removeLast();
            visit[i] = false;
        }
    }
}
