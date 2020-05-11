package com.sylar.leetcode;

import org.junit.Assert;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class TransferZTest {

    @Test
    public void test_001_convert() {
        TransferZ tz = new TransferZ();
        String text = "LEETCODEISHIRING";
        Assert.assertEquals("LCIRETOESIIGEDHN", tz.convert(text, 3));
    }

    @Test
    public void test_002_convert() {
        TransferZ tz = new TransferZ();
        String text = "LEETCODEISHIRING";
        Assert.assertEquals("LDREOEIIECIHNTSG", tz.convert(text, 4));
    }
}