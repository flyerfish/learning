package com.sylar.leetcode;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RecentCounterTest {

    @Test
    public void test_01_ping(){
        RecentCounter rc = new RecentCounter();
        System.out.println(rc.ping(0));
    }

}