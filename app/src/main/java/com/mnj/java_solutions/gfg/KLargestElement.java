package com.mnj.java_solutions.gfg;

import java.util.PriorityQueue;

public class KLargestElement {

    public void kLargest() {

        int[] arr = {12, 5, 787, 1, 23};

        int k = 3;

        int[] result = new int[k];

        PriorityQueue<Integer> queue = new PriorityQueue<>();

        for (int i = 0; i < k; i++)
            queue.add(arr[i]);

        for (int i = k; i < arr.length; i++) {
            if (arr[i] > queue.peek()) {
                queue.poll();
                queue.add(arr[i]);
            }
        }


        System.out.println("==>> Top K largest elements :" + queue.toArray());
    }
}
