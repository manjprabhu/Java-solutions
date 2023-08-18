package com.mnj.java_solutions.queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class QueueReversal {

    public void reverseQueue() {
        Queue<Integer> queue = createQueue();
        Stack<Integer> stack = new Stack<>();

        while (!queue.isEmpty()) {
            stack.add(queue.peek());
            queue.remove();
        }
        while (!stack.isEmpty()) {
            queue.add(stack.pop());
        }

        while (!queue.isEmpty()) {
            System.out.println("==>> " + queue.peek());
            queue.remove();
        }
    }

    private Queue<Integer> createQueue() {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(10);
        queue.add(20);
        queue.add(30);
        queue.add(40);
        queue.add(50);
        queue.add(60);
        queue.add(70);
        queue.add(80);
        queue.add(90);
        queue.add(100);
        return queue;
    }


    public void reverseQueue2() {
        Queue<Integer> queue = createQueue();
        reverse(queue);

        System.out.println("==>> ************* Reverse Queue *******************");
        while (!queue.isEmpty()) {
            System.out.println("==>> " + queue.peek());
            queue.remove();
        }
    }

    private void reverse(Queue<Integer> queue) {
        if (queue.size() == 0) {
            return;
        }
        int ele = queue.peek();
        queue.remove();
        reverse(queue);
        queue.add(ele);
    }

}
