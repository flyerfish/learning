package com.sylar.leetcode.alg;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class TreeNodeTest {

    @Test
    public void test_valueOf() {
        Integer[] nums = {-10, 9, 20, null, null, 15, 7, 3, 2, null, 1};
        TreeNode<Integer> root = TreeNode.valueOf(nums);
    }

    @Test
    public void test_valueOf2() {
        Integer[] nums = {-10, 9, 20, null, null, 15, 7, null, null, null, null};
        List<Integer> numList = Arrays.asList(nums);
        TreeNode<Integer> root = TreeNode.valueOf(numList);
        List<Integer> ret = TreeNode.toValue(root);
        Assert.assertEquals(numList, ret);
    }

    @Test
    public void test_valueOf3() {
        Integer[] nums = {-10, 9, 20, null, null, 15, 7, 3, 2, null, 1};
        List<Integer> numList = Arrays.asList(nums);
        TreeNode<Integer> root = TreeNode.valueOf(numList);
        List<Integer> ret = TreeNode.toValue(root);
        Assert.assertEquals(numList, ret);
    }
}