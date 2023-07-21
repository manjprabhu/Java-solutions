package com.mnj.java_solutions.slidingwindow;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;

public class SlidingWindowMaximumLC239 {

    public void slidingWindowMaximum() {
        int[] nums = {3, 3, 4, 8};
        int k = 2;

        int i = 0, j = 0;

        ArrayList<Integer> result = new ArrayList<>();

        Deque<Integer> deque = new ArrayDeque<>();

        while (j < nums.length) {

            while (deque.size() > 0 && nums[j] > deque.getLast()) {
                deque.removeLast();
            }

            deque.addLast(nums[j]);

            //till we find the window size increment the j pointer
            if (j - i + 1 < k) {
                j++;
            } else if (j - i + 1 == k) {
                // deque contains the maximum element in current window add the element to result.
                result.add(deque.getFirst());

                // Before we slide to next window, remove the out of window element from result.
                if (nums[i] == deque.getFirst()) {
                    deque.removeFirst();
                }

                // slide the window
                i++;
                j++;
            }
        }

        for (Integer integer : result) {
            System.out.println("==>> result is :" + integer);
        }
    }

}
