package com.mnj.java_solutions.slidingwindow;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;

/**
 * You are given an array of integers nums, there is a sliding window of size k which is moving from
 * <p>
 * the very left of the array to the very right. You can only see the k numbers in the window.
 * <p>
 * Each time the sliding window moves right by one position.
 * <p>
 * Return the max sliding window.
 * <p>
 * Input: nums = [1,3,-1,-3,5,3,6,7], k = 3
 * Output: [3,3,5,5,6,7]
 * Explanation:
 * Window position                Max
 * ---------------               -----
 * [1  3  -1] -3  5  3  6  7       3
 * 1 [3  -1  -3] 5  3  6  7       3
 * 1  3 [-1  -3  5] 3  6  7       5
 * 1  3  -1 [-3  5  3] 6  7       5
 * 1  3  -1  -3 [5  3  6] 7       6
 * 1  3  -1  -3  5 [3  6  7]      7
 **/
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
