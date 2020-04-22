package com.sylar.leetcode;

import java.util.LinkedList;
import java.util.Queue;

public class RecentCounter {

    private Queue<Integer> pingQueue = new LinkedList<Integer>();
    public RecentCounter() {

    }

    public int ping(int t) {
        pingQueue.add(t);
        while(pingQueue.element()< t - 3000){
            pingQueue.remove();
        }

        return pingQueue.size();
    }
}
