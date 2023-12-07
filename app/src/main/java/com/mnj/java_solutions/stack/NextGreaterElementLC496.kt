package com.mnj.java_solutions.stack

import java.util.*

/***
 * The next greater element of some element x in an array is the first greater element that is to the right of x in the same array.
 *
 * You are given two distinct 0-indexed integer arrays nums1 and nums2, where nums1 is a subset of nums2.
 *
 * For each 0 <= i < nums1.length, find the index j such that nums1[i] == nums2[j] and determine the next greater element of nums2[j] in nums2. If there is no next greater element, then the answer for this query is -1.
 *
 * Return an array ans of length nums1.length such that ans[i] is the next greater element as described above.
 *
 *
 *
 * Example 1:
 *
 * Input: nums1 = [4,1,2], nums2 = [1,3,4,2]
 * Output: [-1,3,-1]
 * Explanation: The next greater element for each value of nums1 is as follows:
 * - 4 is underlined in nums2 = [1,3,4,2]. There is no next greater element, so the answer is -1.
 * - 1 is underlined in nums2 = [1,3,4,2]. The next greater element is 3.
 * - 2 is underlined in nums2 = [1,3,4,2]. There is no next greater element, so the answer is -1.
 * Example 2:
 *
 * Input: nums1 = [2,4], nums2 = [1,2,3,4]
 * Output: [3,-1]
 * Explanation: The next greater element for each value of nums1 is as follows:
 * - 2 is underlined in nums2 = [1,2,3,4]. The next greater element is 3.
 * - 4 is underlined in nums2 = [1,2,3,4]. There is no next greater element, so the answer is -1.
 *
 */
class NextGreaterElementLC496 {
    fun nextGreaterElement() {

        val nums1 = intArrayOf(4, 1, 2)
        val nums2 = intArrayOf(1, 2, 4, 2, 3)

        val stack = Stack<Int>()
        val map = HashMap<Int, Int>()

        for (num in nums2) {
            while (!stack.isEmpty() && stack.peek() < num) {
                map[stack.pop()] = num
            }
            stack.push(num)
        }

        var index = 0
        for (num in nums1) {
            nums1[index++] = map.getOrDefault(num, -1)
        }
        for (num in nums1) {
            println("==>> Next greater element is :$num")
        }
    }

/*
*
*  int[] nums1 = {4,1,2};
   int[] nums2 = {1,3,4,2};
   *
   * 1. stack[1]
   *
   * 2. if(stack is not empty and 1 < 3) {
   *    map(1,3)
   * }
   *   stack[3]
   *
   * 3. if(stack is not empty and 3 < 4)
   *   {
   *     map.put(3,4)
   *    }
   *
   *  stack[4]
   *
   * 4. if(stack is not empty and 4 is not smaller than 2)
   *
   *   stack[ 2, 4]
   *
* */
}