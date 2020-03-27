package com.sylar.leetcode;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.Assert;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class IntegerReverseTest {

    @Test
    public void test_reverse(){
        IntegerReverse ir = new IntegerReverse();
        Assert.assertEquals(-123, ir.reverse2(-321));
    }

    @Test
    public void test_reverse2(){
        IntegerReverse ir = new IntegerReverse();
        Assert.assertEquals(-123, ir.reverse2(-321));
    }

}