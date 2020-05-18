package com.sylar.leetcode.str;

import com.sylar.leetcode.alg.Str;

import java.util.ArrayList;
import java.util.List;

// 792 https://leetcode-cn.com/problems/number-of-matching-subsequences/
public class MatchingSubseq {
    public int numMatchingSubseq(String S, String[] words) {
        int retCount = 0;
        for (String text : words) {
            if (Str.isSubSeq(text, S)) {
                retCount++;
            }
        }
        return retCount;
    }

    class Node {
        String word;
        int index;

        Node(String word, int index) {
            this.word = word;
            this.index = index;
        }
    }

    public int numMatchingSubseq2(String S, String[] words) {
        List<Node>[] wordBucket = new ArrayList[26];
        for (int i = 0; i < 26; ++i) {
            wordBucket[i] = new ArrayList<>();
        }
        for (String word : words) {
            wordBucket[word.charAt(0) - 'a'].add(new Node(word, 0));
        }

        int retCount = 0;
        int strLen = S.length();
        for (int i = 0; i < strLen; ++i) {
            List<Node> bucket = wordBucket[S.charAt(i) - 'a'];
            wordBucket[S.charAt(i) - 'a'] = new ArrayList<>();
            for (Node node : bucket) {
                node.index++;
                if (node.index == node.word.length()) {
                    retCount++;
                } else {
                    wordBucket[node.word.charAt(node.index) - 'a'].add(node);
                }
            }
        }

        return retCount;
    }
}
