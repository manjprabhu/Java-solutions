package com.mnj.java_solutions.gfg;

import java.util.PriorityQueue;

public class SecondLargestElement {

    public void secondLargestElement() {

        int k = 2;
        int[] a = {12, 35, 1, 10, 34, 1};

        PriorityQueue<Integer> queue = new PriorityQueue<>();

        for (int i = 0; i < k; i++) {
            queue.add(a[i]);
        }

        for (int i = k; i < a.length; i++) {
            if (queue.peek() < a[i]) {
                queue.poll();
                queue.add(a[i]);
            }
        }
        System.out.println("==>> " + k + "th largest element is:" + queue.peek());
    }
}
