package com.mnj.java_solutions.array;

import java.util.PriorityQueue;

public class FirstMissingElementLC41 {

    public void firstMissingPositive() {

        int[] nums = {1, 3, 6, 4, 1, 2};

        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        // Add all the positive numbers in the PriorityQueue

        for (int num : nums) {
            if (num > 0) minHeap.add(num);
        }
        int missingElement = 1;
        // Check for all minimum missing positive number
        while (!minHeap.isEmpty()) {
            int element = minHeap.poll();
            if (element == missingElement)
                missingElement++;
            else if (element > missingElement)
                break;
        }
        System.out.println("==>> Missing number :" + missingElement);
    }
}
