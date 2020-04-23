package com.sylar.leetcode;

import java.util.LinkedList;
import java.util.Queue;

public class RecentCounter {

    private Queue<Integer> pingQueue = new LinkedList<>();
    public RecentCounter() {

    }

    public int ping(int t) {
        pingQueue.add(t);
        while(pingQueue.element()< t - 3000){
            pingQueue.remove();
        }

        return pingQueue.size();
    }

    public int ping2(int t) {
        pingQueue.offer(t);
        while(pingQueue.poll()< t - 3000){
            pingQueue.peek();
        }

        return pingQueue.size();
    }
}
