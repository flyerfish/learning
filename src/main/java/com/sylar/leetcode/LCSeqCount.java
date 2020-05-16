package com.sylar.leetcode;

import java.util.LinkedList;
import java.util.List;

public class LCSeqCount {
    public int getLcsCount(String target, String block) {
        int targetLen = target.length();
        int lastPos = 0;
        int retCount = 0;
        for (int i = 0; i < targetLen && lastPos < targetLen; ++i) {
            StringBuilder subStr = new StringBuilder();
            for (int j = lastPos; j < targetLen; ++j) {
                subStr.append(target.charAt(j));
                if (isSubSeq(subStr.toString(), block)) {
                    if (j == targetLen - 1) {
                        System.out.println(subStr.toString());
                        lastPos = targetLen;
                        retCount++;
                        break;
                    } else {
                        continue;
                    }
                } else {
                    subStr.deleteCharAt(subStr.length() - 1);
                    System.out.println(subStr.toString());
                    lastPos = j;
                    retCount++;
                    break;
                }
            }
        }
        return retCount;
    }

    public boolean isSubSeq(String text1, String text2) {
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

    public List<String> getSubStr(String target) {
        List<String> subStrList = new LinkedList<>();
        for (int i = 0; i < target.length(); ++i) {
            StringBuilder sb = new StringBuilder();
            for (int j = i; j < target.length(); ++j) {
                sb.append(target.charAt(j));
                subStrList.add(sb.toString());
            }
        }

        return subStrList;
    }
}
