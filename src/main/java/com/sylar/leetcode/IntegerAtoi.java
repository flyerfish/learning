package com.sylar.leetcode;

public class IntegerAtoi{

    public int myAtoi(String str) {
        int len = str.length();

        // 去除前导空格
        int index = 0;
        while (index < len) {
            if (str.charAt(index) != ' ') {
                break;
            }
            index++;
        }

        if (index == len) {
            return 0;
        }

        // 第 1 个字符如果是符号，判断合法性，并记录正负
        int sign = 1;
        char firstChar = str.charAt(index);
        if (firstChar == '+') {
            index++;
            sign = 1;
        } else if (firstChar == '-') {
            index++;
            sign = -1;
        }

        // 不能使用 long 类型，这是题目说的
        int res = 0;
        while (index < len) {
            char currChar = str.charAt(index);
            // 判断合法性
            if (currChar > '9' || currChar < '0') {
                break;
            }

            // 题目中说：环境只能存储 32 位大小的有符号整数，因此，需要提前判断乘以 10 以后是否越界
            if (res > Integer.MAX_VALUE / 10 || (res == Integer.MAX_VALUE / 10 && (currChar - '0') > Integer.MAX_VALUE % 10)) {
                return Integer.MAX_VALUE;
            }
            if (res < Integer.MIN_VALUE / 10 || (res == Integer.MIN_VALUE / 10 && (currChar - '0') > -(Integer.MIN_VALUE % 10))) {
                return Integer.MIN_VALUE;
            }

            // 每一步都把符号位乘进去
            res = res * 10 + sign * (currChar - '0');
            index++;
        }

        return res;
    }

    public int myAtoi2(String str) {
        int begin = -1;
        int end = -1;
        for( int i = 0; i < str.length(); ++i ){
            if(begin == -1 && isDigit(str.charAt(i))){
                begin = i;
                continue;
            }
            if( begin == -1 && isSign(str.charAt(i))){
                begin = i;
                continue;
            }

            if( false == isDigit(str.charAt(i))){
                if(begin != -1) {
                    end = i;
                    break;
                }else if( isSign(str.charAt(i))){
                    begin = i;
                }else if( isSpace(str.charAt(i))) {
                    continue;
                }else{
                    return 0;
                }
            }
        }

        if( begin >= str.length() || begin == -1){
            return 0;
        }
        String numStr = null;
        if(end != -1){
            numStr = str.substring(begin, end);
        }else{
            numStr = str.substring(begin);
        }
        if( numStr.equals("+") || numStr.equals("-")){
            return 0;
        }

        long res = 0;
        try{
            res = Long.valueOf(numStr);
        } catch (Exception ex){
            if(numStr.charAt(0) == '-'){
                return Integer.MIN_VALUE;
            }else{
                return Integer.MAX_VALUE;
            }
        }
        if( (int)res != res){
            if(res > 0) {
                return Integer.MAX_VALUE;
            }else{
                return Integer.MIN_VALUE;
            }
        }else{
            return (int)res;
        }
    }

    private boolean isDigit(char c){
        if( c >= '0' && c <= '9'){
            return true;
        }
        return false;
    }

    private boolean isSign(char c){
        if( c == '-' || c == '+'){
            return true;
        }
        return false;
    }

    private boolean isSpace(char c){
        if( c == ' ' || c == '\t'){
            return true;
        }
        return false;
    }
}