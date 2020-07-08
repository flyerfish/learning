package com.sylar.leetcode.str;

public class MagicStr {
    public int magicalString(int n) {
        if (n == 0) {
            return 0;
        }
        if (n <= 3) {
            return 1;
        }

        StringBuffer str = new StringBuffer("122");
        int count = 1;
        for (int i = 2; str.length() < n; i++) {
            if (str.charAt(i) == '1') {
                if (str.charAt(str.length() - 1) == '1') {
                    str.append('2');
                } else {
                    str.append('1');
                    count += 1;
                }
            } else if (str.charAt(str.length() - 1) == '1') {
                str.append("22");
            } else {
                str.append(11);
                count += 2;
            }
        }

        if (str.length() > n && str.charAt(str.length() - 1) == '1') {
            count -= 1;
        }
        return count;
    }
}
