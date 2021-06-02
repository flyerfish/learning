package com.chaos.leetcode;

import com.chaos.leetcode.common.TreeNode;

import java.util.HashMap;
import java.util.Map;

//https://leetcode-cn.com/problems/house-robber-iii/
public class HouseRobber337 {
    Map<TreeNode, Integer> memo = new HashMap<>();

    public int rob(TreeNode root) {
        if (root == null) {
            return 0;
        }

        // 利用备忘录消除重叠子问题
        if (memo.containsKey(root)) {
            return memo.get(root);
        }
        // 抢，然后去下下家
        int do_it = root.val
            + (root.left == null ? 0 : rob(root.left.left) + rob(root.left.right))
            + (root.right == null ? 0 : rob(root.right.left) + rob(root.right.right));

        // 不抢，然后去下家
        int not_do = rob(root.left) + rob(root.right);
        int res = Math.max(do_it, not_do);
        //System.out.printf("val=%d do--%d : not-do--%d : max--%d\n", root.val, do_it, not_do, res);
        memo.put(root, res);
        return res;
    }
}
