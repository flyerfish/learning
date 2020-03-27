package com.sylar.leetcode;

/**
 * 判断一个整数是否是回文数。回文数是指正序（从左向右）和倒序（从右向左）读都是一样的整数。
 * https://leetcode-cn.com/problems/palindrome-number/
 */
public class Palindrome {
    public boolean isPalindrome2(int x) {
        String reversedStr = (new StringBuilder(x + "")).reverse().toString();
        return (x + "").equals(reversedStr);
    }

    public boolean isPalindrome(int x){
        if( x < 0 ){
            return false;
        }

        int res = 0;
        int oldx = x;
        while(x != 0 ){
            res = x % 10 + res * 10;
            x /= 10;
        }
        if( res == oldx ){
            return true;
        }else{
            return false;
        }
    }
}
