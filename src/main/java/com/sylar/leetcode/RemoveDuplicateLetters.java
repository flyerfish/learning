package com.sylar.leetcode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;

public class RemoveDuplicateLetters {
    public String removeDuplicateLetters(String s) {
        // this will let us know if there are any more instances of s[i] left in s
        HashMap<Character, Integer> lastOccurrence = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            lastOccurrence.put(s.charAt(i), i);
        }

        LinkedList<Character> stack = new LinkedList<>();
        // this lets us keep track of what's in our solution in O(1) time
        HashSet<Character> seen = new HashSet<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            // we can only try to add c if it's not already in our solution
            // this is to maintain only one of each character
            if (!seen.contains(c)) {
                while (!stack.isEmpty() && c < stack.getLast() && lastOccurrence.get(stack.getLast()) > i) {
                    seen.remove(stack.removeLast());
                }
                seen.add(c);
                stack.addLast(c);
            }
        }
        StringBuilder sb = new StringBuilder(stack.size());
        for (Character c : stack) {
            sb.append(c.charValue());
        }
        return sb.toString();
    }

    public String removeDuplicateLetters2(String s) {
        HashMap<Character, Integer> map = new HashMap();
        for (int i = 0; i < s.length(); i++) {
            map.put(s.charAt(i), i);
        }

        LinkedList<Character> q = new LinkedList();
        for (int i = 0; i < s.length(); i++) {
            Character c = s.charAt(i);
            if (!q.contains(c)) {
                while (!q.isEmpty() && c < q.getLast() && map.get(q.getLast()) > i) {
                    q.removeLast();
                }
                q.add(s.charAt(i));
            }
        }

        StringBuilder sb = new StringBuilder(q.size());
        for (Character c : q) {
            sb.append(c.charValue());
        }
        return sb.toString();
    }
}
