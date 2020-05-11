package com.sylar.leetcode;

import java.util.Arrays;
import java.util.Comparator;

public class OverlapIntervals {

    // 435
    int eraseOverlapIntervals(int[][] intervals) {
        int n = intervals.length;
        return n - intervalSchedule(intervals);
    }

    public int intervalSchedule(int[][] intvs) {
        if (intvs.length == 0) {
            return 0;
        }

        // 按 end 升序排序
        Arrays.sort(intvs, new Comparator<int[]>() {
            public int compare(int[] a, int[] b) {
                return a[1] - b[1];
            }
        });

        // 至少有一个区间不相交
        int count = 1;
        // 排序后，第一个区间就是 x
        int xEnd = intvs[0][1];
        for (int[] interval : intvs) {
            int start = interval[0];
            if (start >= xEnd) {
                // 找到下一个选择的区间了
                count++;
                xEnd = interval[1];
            }
        }
        return count;
    }
}
