package com.sylar.leetcode;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.Assert;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class IntegerAtoiTest {

    @Test
    public void test_atoi_001(){
        IntegerAtoi at = new IntegerAtoi();
        int res = at.myAtoi("42");
        Assert.assertEquals(42, res);
    }

    @Test
    public void test_atoi_002(){
        IntegerAtoi at = new IntegerAtoi();
        int res = at.myAtoi("   -42");
        Assert.assertEquals(-42, res);
    }


    @Test
    public void test_atoi_003(){
        IntegerAtoi at = new IntegerAtoi();
        int res = at.myAtoi("4193 with words");
        Assert.assertEquals(4193, res);
    }

    @Test
    public void test_atoi_004(){
        IntegerAtoi at = new IntegerAtoi();
        int res = at.myAtoi("words and 987");
        Assert.assertEquals(0, res);
    }

    @Test
    public void test_atoi_005(){
        IntegerAtoi at = new IntegerAtoi();
        int res = at.myAtoi("-91283472332");
        Assert.assertEquals(-2147483648, res);
    }

    @Test
    public void test_atoi_006(){
        IntegerAtoi at = new IntegerAtoi();
        int res = at.myAtoi("+");
        Assert.assertEquals(0, res);
    }

    @Test
    public void test_atoi_007(){
        IntegerAtoi at = new IntegerAtoi();
        int res = at.myAtoi("2147483648");
        Assert.assertEquals(2147483647, res);
    }

    @Test
    public void test_atoi_008(){
        IntegerAtoi at = new IntegerAtoi();
        int res = at.myAtoi("-12147483648");
        Assert.assertEquals(-2147483648, res);
    }

    @Test
    public void test_atoi_009(){
        IntegerAtoi at = new IntegerAtoi();
        int res = at.myAtoi("12345678901234567890");
        Assert.assertEquals(2147483647, res);
    }

    @Test
    public void test_atoi_010(){
        IntegerAtoi at = new IntegerAtoi();
        int res = at.myAtoi("+12345678901234567890");
        Assert.assertEquals(2147483647, res);
    }

    @Test
    public void test_atoi_011(){
        IntegerAtoi at = new IntegerAtoi();
        int res = at.myAtoi("-12345678901234567890");
        Assert.assertEquals(-2147483648, res);
    }

    @Test
    public void test_atoi_012(){
        IntegerAtoi at = new IntegerAtoi();
        int res = at.myAtoi("-0000000000001234");
        Assert.assertEquals(-1234, res);
    }

    @Test
    public void test_atoi_013(){
        IntegerAtoi at = new IntegerAtoi();
        int res = at.myAtoi(" 0000000000001234");
        Assert.assertEquals(1234, res);
    }
}