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

            if(isMatch(c, stack.peek())){
                stack.pop();
            }
        }

        if(stack.isEmpty()){
            return true;
        }
        return false;
    }

    boolean isMatch(Character c1, Character c2){
        if( c1 == ')' && c2 == '(' ){
            return true;
        }else if(c1 == ']' && c2 == '['){
            return true;
        }else if(c1 == '}' && c2 == '{'){
            return true;
        }
        return false;
    }
}
