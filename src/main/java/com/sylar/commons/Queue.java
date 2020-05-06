package com.sylar.commons;

import java.util.LinkedList;

public class Queue<T> {
    private LinkedList<T> list = new LinkedList<>();

    public void push(T object) {
        list.addFirst(object);
    }

    public T top() {
        return list.getFirst();
    }

    public T pop() {
        return list.removeFirst();
    }

    public boolean empty() {
        return list.isEmpty();
    }

    public int size(){
        return list.size();
    }
}
