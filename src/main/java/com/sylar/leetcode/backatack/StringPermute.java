package com.sylar.leetcode.backatack;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class StringPermute {
    List<List<Character>> res = new LinkedList<>();

    public String[] permutation(String s) {
        Character[] cs = new Character[s.length()];
        for (int i = 0; i < s.length(); ++i) {
            cs[i] = s.charAt(i);
        }

        Arrays.sort(cs);

        boolean[] visit = new boolean[cs.length];
        // 记录「路径」
        LinkedList<Character> track = new LinkedList<>();
        backtrack(cs, visit, track);
        String[] ret = new String[res.size()];
        for (int i = 0; i < res.size(); ++i) {
            ret[i] = list2String(res.get(i));
        }
        return ret;
    }

    private String list2String(List<Character> lc) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < lc.size(); ++i) {
            sb.append(lc.get(i));
        }
        return sb.toString();
    }

    private void backtrack(Character[] nums, boolean[] visit, LinkedList<Character> track) {
        if (nums.length == track.size()) {
            res.add(new LinkedList(track));
            return;
        }

        for (int i = 0; i < nums.length; i++) {
            if (visit[i] == true) {
                continue;
            }
            if (i > 0 && nums[i].equals(nums[i - 1]) && visit[i - 1] == true) {
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
