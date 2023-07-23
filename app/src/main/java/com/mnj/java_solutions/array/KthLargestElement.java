package com.mnj.java_solutions.array;

import java.util.PriorityQueue;

public class KthLargestElement {

    public void kthLargestElement() {

        int a[] = {1, 9, 3, 6, 8, 2, 7, 5, 4};

        int k = 3;

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
        System.out.println("==>> K " + k + " th element is :" + queue.peek());
    }
}
