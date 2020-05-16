package com.sylar.leetcode.str;

import com.sylar.leetcode.alg.Str;

// 792 https://leetcode-cn.com/problems/number-of-matching-subsequences/
public class MatchingSubseq {
    public int numMatchingSubseq(String S, String[] words) {
        int retCount = 0;
        for(String text : words) {
            if( Str.isSubSeq(text, S) ) {
                retCount++;
            }
        }
        return retCount;
    }
}
