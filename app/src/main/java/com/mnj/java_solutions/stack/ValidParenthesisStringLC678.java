package com.mnj.java_solutions.stack;

import java.util.Stack;

public class ValidParenthesisStringLC678 {

    public void isValid() {
        String str = ")***";

        Stack<Integer> stack = new Stack<>();
        Stack<Integer> starStack = new Stack<>();

        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);

            if (ch == '(') {
                stack.push(i);
            } else if (ch == '*') {
                starStack.push(i);
            } else {
                if (!stack.isEmpty()) {
                    stack.pop();
                } else if (!starStack.isEmpty()) {
                    starStack.pop();
                } else {
                    System.out.println("==>> Invalid string ......");
                    return;
                }
            }
        }

        while (!stack.isEmpty()) {
            if (starStack.isEmpty()) {
                System.out.println("==>> Invalid string ......");
                return;
            } else if (starStack.peek() < stack.peek()) {
                System.out.println("==>> Invalid string ......");
                return;
            } else {
                starStack.pop();
                stack.pop();
            }
        }
        System.out.println("==>> Valid  string *******");

    }
}
