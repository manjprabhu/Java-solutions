package com.mnj.java_solutions.stack;

import java.util.Stack;

public class RemoveAllAdjacentDuplicates {

    public void removeDuplicate() {

        String str = "azxxzy";
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (!stack.isEmpty() && stack.peek() == ch) {
                stack.pop();
            } else {
                stack.push(ch);
            }
        }
        char[] result = new char[stack.size()];
        int index = stack.size()-1;
        while (!stack.isEmpty()) {
            result[index--] = stack.pop();
        }
        System.out.println("==>> Result: " + String.valueOf(result));
    }
}
