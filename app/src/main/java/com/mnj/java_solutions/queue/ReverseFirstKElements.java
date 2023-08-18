package com.mnj.java_solutions.queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ReverseFirstKElements {

    public void reverseQueue() {
        int k = 3;
        Queue<Integer> queue = createQueue();
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < k; i++) {
            stack.add(queue.peek());
            queue.remove();
        }

        while (!stack.isEmpty()) {
            queue.add(stack.pop());
        }

        for (int i = 0; i < queue.size() - k; i++) {
            queue.add(queue.peek());
            queue.remove();
        }

        System.out.println("==>> ************* Reverse Queue *******************");
        for (int num : queue)
            System.out.println("==>>  " + num);
    }

    private Queue<Integer> createQueue() {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        queue.add(5);
        return queue;
    }
}
