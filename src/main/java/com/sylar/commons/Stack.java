package com.sylar.commons;

import java.util.LinkedList;

public class Stack<T> {
    private LinkedList<T> list = new LinkedList<>();

    public void push(T obj) {
        list.addLast(obj);
    }

    public T pop() {
        if( empty() ){
            return null;
        }
        return list.removeLast();
    }

    public T peek() {
        if( empty() ){
            return null;
        }
        return list.getLast();
    }

    public boolean empty() {
        return list.isEmpty();
    }

    public int size(){
        return list.size();
    }
}
