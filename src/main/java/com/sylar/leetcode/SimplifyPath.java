package com.sylar.leetcode;

import java.util.LinkedList;
import java.util.List;

public class SimplifyPath {

    public String removePathNumber(String path){
        StringBuffer sb = new StringBuffer();
        for( int i = 0; i < path.length(); ){
            if(path.charAt(i) != '/'){
                sb.append(path.charAt(i++));
            }else{
                sb.append(path.charAt(i++));
                while(i < path.length() && path.charAt(i) == '/'){
                    i++;
                }
            }
        }
        return sb.toString();
    }

    public String simplifyPath(String path) {
        if(path == null || "".equals(path)){
            return null;
        }
        String newPath = removePathNumber(path);
        LinkedList<String> stack = new LinkedList<>();
        String[] subPaths = newPath.split("/");
        for(int i = 0; i < subPaths.length; ++i){
            if("".equals(subPaths[i])){
                continue;
            }
            if(subPaths[i].equals(".")) {
                continue;
            }else if(subPaths[i].equals("..")){
                if(stack.isEmpty()){
                    continue;
                }else{
                    stack.removeLast();
                }
            }else{
                stack.addLast(subPaths[i]);
            }
        }
        if(stack.isEmpty()){
            return "/";
        }

        StringBuffer ret = new StringBuffer();
        for(String s : stack){
            ret.append("/" + s);
        }
        return ret.toString();
    }
}
