package com.sylar.commons;

import java.util.LinkedList;

public class Stack<T> {
    private LinkedList<T> list = new LinkedList<>();

    public void push(T object) {
        list.addFirst(object);
    }

    public T pop() {
        return list.removeFirst();
    }

    public T peek() {
        return list.getFirst();
    }

    public boolean empty() {
        return list.isEmpty();
    }

    public int size(){
        return list.size();
    }
}
