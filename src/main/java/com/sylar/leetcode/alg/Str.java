package com.sylar.leetcode.alg;

import java.util.LinkedList;
import java.util.List;

public class Str {
    public static List<String> getSubStrList(String text) {
        List<String> subStrList = new LinkedList<>();
        for (int i = 0; i < text.length(); ++i) {
            StringBuilder sb = new StringBuilder();
            for (int j = i; j < text.length(); ++j) {
                sb.append(text.charAt(j));
                subStrList.add(sb.toString());
            }
        }

        return subStrList;
    }

    public static boolean isSubSeq(String text1, String text2) {
        if (text1.length() > text2.length()) {
            return false;
        }

        int curPos = 0;
        for (int i = 0; i < text1.length(); ++i) {
            int newPos = text2.indexOf(text1.charAt(i), curPos);
            if (newPos != -1) {
                curPos = newPos + 1;
            } else {
                return false;
            }
        }

        return true;
    }

    public static boolean isSubSeqHash(String text1, String text2) {
        LinkedList<Integer>[] arrayText = new LinkedList[26];
        for (int i = 0; i < 26; ++i) {
            arrayText[i] = new LinkedList<>();
        }
        int targetLen = text2.length();
        for (int i = 0; i < targetLen; ++i) {
            arrayText[text2.charAt(i) - 'a'].add(i);
        }

        int curPos = 0;
        for (Character c : text1.toCharArray()) {
            while (arrayText[c - 'a'].size() != 0 && arrayText[c - 'a'].getFirst() < curPos) {
                arrayText[c - 'a'].removeFirst();
            }
            if (arrayText[c - 'a'].size() > 0) {
                curPos = arrayText[c - 'a'].removeFirst();
            } else {
                return false;
            }
        }

        return true;
    }

    public static boolean isSubSeqDp(String s, String t) {
        int sLen = s.length(), tLen = t.length();
        if (sLen > tLen) {
            return false;
        }
        if (sLen == 0) {
            return true;
        }
        boolean[][] dp = new boolean[sLen + 1][tLen + 1];
        //初始化
        for (int j = 0; j < tLen; j++) {
            dp[0][j] = true;
        }
        //dp
        for (int i = 1; i <= sLen; i++) {
            for (int j = 1; j <= tLen; j++) {
                if (s.charAt(i - 1) == t.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1];
                } else {
                    dp[i][j] = dp[i][j - 1];
                }
            }
        }
        return dp[sLen][tLen];
    }


}
