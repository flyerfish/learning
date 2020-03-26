package com.sylar.leetcode;

public class IntegerAtoi{
    public int myAtoi(String str) {
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