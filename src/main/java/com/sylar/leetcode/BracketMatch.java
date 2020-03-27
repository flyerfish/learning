package com.sylar.leetcode;

import java.util.Stack;

public class BracketMatch {
    public boolean isValid(String s) {
        if(null == s){
            return false;
        }
        if("".equals(s)){
            return true;
        }

        if( s.length() % 2 != 0){
            return false;
        }
        Stack<Character> stack = new Stack<>();
        for(int i = 0; i < s.length(); ++i){
            Character c = s.charAt(i);
            if( c == '(' || c == '[' || c == '{'){
                stack.push(c);
                continue;
            }

            if(stack.isEmpty()){
                return false;
            }

            if(isMatch(c,stack)){
                stack.pop();
            }
        }

        if(stack.isEmpty()){
            return true;
        }
        return false;
    }

    boolean isMatch(Character c, Stack<Character> stack){
        if( c == ')' && stack.peek() == '(' ){
            return true;
        }else if(c == ']' && stack.peek() == '['){
            return true;
        }else if(c == '}' && stack.peek() == '{'){
            return true;
        }
        return false;
    }
}
