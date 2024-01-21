package com.mnj.java_solutions.slidingwindow

import java.util.ArrayDeque
import java.util.Deque

/**
 * You are given an array of integers nums, there is a sliding window of size k which is moving from
 *
 *
 * the very left of the array to the very right. You can only see the k numbers in the window.
 *
 *
 * Each time the sliding window moves right by one position.
 *
 *
 * Return the max sliding window.
 *
 *
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
 */
class SlidingWindowMaximumLC239 {
    fun slidingWindowMaximum() {
        val nums = intArrayOf(3, 3, 4, 8)
        val k = 2
        var i = 0
        var j = 0
        val result = ArrayList<Int>()
        val deque: Deque<Int> = ArrayDeque()
        while (j < nums.size) {
            while (deque.size > 0 && nums[j] > deque.last) {
                deque.removeLast()
            }
            deque.addLast(nums[j])

            //till we find the window size increment the j pointer
            if (j - i + 1 < k) {
                j++
            } else if (j - i + 1 == k) {
                // deque contains the maximum element in current window add the element to result.
                result.add(deque.first)

                // Before we slide to next window, remove the out of window element from result.
                if (nums[i] == deque.first) {
                    deque.removeFirst()
                }
                // slide the window
                i++
                j++
            }
        }
        for (integer in result) {
            println("==>> result is :$integer")
        }
    }
}
