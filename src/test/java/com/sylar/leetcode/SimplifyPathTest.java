package com.sylar.leetcode;

import org.junit.Assert;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class SimplifyPathTest {

    @Test
    public void test_001_removePathNumber(){
        SimplifyPath sp = new SimplifyPath();
        Assert.assertEquals("/test/", sp.removePathNumber("//test///"));
    }

    @Test
    public void test_002_removePathNumber(){
        SimplifyPath sp = new SimplifyPath();
        Assert.assertEquals("/test/a", sp.removePathNumber("//test///a"));
    }

    @Test
    public void test_003_removePathNumber(){
        SimplifyPath sp = new SimplifyPath();
        Assert.assertEquals("/test/a", sp.removePathNumber("/test/a"));
    }

    @Test
    public void test_001_simplifyPathTest(){
        SimplifyPath sp = new SimplifyPath();
        Assert.assertEquals("/test", sp.simplifyPath("//test///"));
    }

    @Test
    public void test_002_simplifyPathTest(){
        SimplifyPath sp = new SimplifyPath();
        Assert.assertEquals("/home", sp.simplifyPath("/home/"));
    }

    @Test
    public void test_003_simplifyPathTest(){
        SimplifyPath sp = new SimplifyPath();
        Assert.assertEquals("/", sp.simplifyPath("/../"));
    }

    @Test
    public void test_004_simplifyPathTest(){
        SimplifyPath sp = new SimplifyPath();
        Assert.assertEquals("/home/foo", sp.simplifyPath("/home//foo/"));
    }

    @Test
    public void test_005_simplifyPathTest(){
        SimplifyPath sp = new SimplifyPath();
        Assert.assertEquals("/c", sp.simplifyPath("/a/./b/../../c/"));
    }

    @Test
    public void test_006_simplifyPathTest(){
        SimplifyPath sp = new SimplifyPath();
        Assert.assertEquals("/c", sp.simplifyPath("/a/../../b/../c//.//"));
    }

    @Test
    public void test_007_simplifyPathTest(){
        SimplifyPath sp = new SimplifyPath();
        Assert.assertEquals("/a/b/c", sp.simplifyPath("/a//b////c/d//././/.."));
    }
}