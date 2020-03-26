package com.sylar.leetcode;

public class IntegerReverse {
    public int reverse(int x) {
        String str = String.valueOf(x);
        if (x < 0) {
            str = str.substring(1);
        }
        str = new StringBuilder(str).reverse().toString();
        String newStr = "0";
        for (int i = 0; i < str.length(); ++i) {
            if (str.charAt(i) != '0') {
                newStr = str.substring(i);
                break;
            }
        }
        try {
            if (x < 0) {
                return Integer.valueOf(newStr) * (-1);
            } else {
                return Integer.valueOf(newStr);
            }
        } catch (Exception e) {
            return 0;
        }
    }

    public int reverse2(int x) {
        long res = 0;
        while (x != 0) {
            res = x % 10 + res * 10;
            x /= 10;
        }
        return (res < Integer.MIN_VALUE || res > Integer.MAX_VALUE) ? 0 : (int) res;
    }
}
