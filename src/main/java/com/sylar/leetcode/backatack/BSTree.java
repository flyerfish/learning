package com.sylar.leetcode.backatack;

import com.sylar.leetcode.tree.TreeNode;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

public class BSTree {
    List<List<Integer>> res = new LinkedList<>();

    public List<List<Integer>> BSTSequences(TreeNode root) {
        if (root == null) {
            res.add(new LinkedList<>());
            return res;
        }
        HashSet<TreeNode> track = new HashSet<>();
        track.add(root);
        LinkedList<Integer> answer = new LinkedList<>();
        backtrack(track, answer);
        return res;
    }

    void backtrack(HashSet<TreeNode> track, LinkedList<Integer> answer) {
        if (track.size() == 0) {
            res.add(new LinkedList<Integer>(answer));
            return;
        }

        HashSet<TreeNode> nextTrack = new HashSet<>(track);
        for (TreeNode node : track) {
            answer.add(node.val);
            nextTrack.remove(node);

            if (node.left != null) {
                nextTrack.add(node.left);
            }
            if (node.right != null) {
                nextTrack.add(node.right);
            }
            backtrack(nextTrack, answer);
            if (node.left != null) {
                nextTrack.remove(node.left);
            }
            if (node.right != null) {
                nextTrack.remove(node.right);
            }
            nextTrack.add(node);
            answer.removeLast();
        }
    }
}
