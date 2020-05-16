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
}
