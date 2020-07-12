package com.sylar.leetcode.backatack;

import com.sylar.leetcode.tree.TreeNode;
import org.junit.Test;

public class BSTreeTest {

    @Test
    public void BSTSequences() {
        Integer[] nums = {2, 1, 3};
        TreeNode root = TreeNode.valueOf(nums);
        BSTree bst = new BSTree();
        System.out.println(bst.BSTSequences(root));
    }

    @Test
    public void BSTSequences2() {
        Integer[] nums = {};
        TreeNode root = TreeNode.valueOf(nums);
        BSTree bst = new BSTree();
        System.out.println(bst.BSTSequences(root));
    }
}