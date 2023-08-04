package com.mnj.java_solutions.stack;

import java.util.Stack;

public class ReverseStack {

    public void revereStack() {
        Stack<Integer> s = new Stack<>();
        s.push(7);
        s.push(1);
        s.push(4);
        s.push(5);

        reverse(s);
    }

    private void reverse(Stack<Integer> stack) {
        System.out.println("==>> Reverse ..1");
        if (stack.isEmpty())
            return;

        int element = stack.peek();
        stack.pop();
        reverse(stack);

        System.out.println("==>> Reverse ..2");
        insertBottom(stack, element);
        System.out.println("==>> Reverse ..3");
    }

    private void insertBottom(Stack<Integer> stack, int num) {
        if (stack.isEmpty()) {
            stack.push(num);
            return;
        }
        int element = stack.peek();
        stack.pop();

        insertBottom(stack, num);
        stack.push(element);
    }

}
