package com.mnj.java_solutions.gfg;

import java.util.Stack;

public class LeadersInArray {

    public void leadersInArray() {

        int[] a = {16, 17, 4, 3, 5, 2};

        Stack<Integer> stack = new Stack<>();
        stack.push(a[a.length-1]);

        for (int i = a.length-1; i >= 0; i--) {

            if (stack.peek() < a[i]) {
                stack.push(a[i]);
            }
        }
        while (!stack.isEmpty()) {
            System.out.println("==>> Leaders are:" + stack.pop());
        }
    }
}
