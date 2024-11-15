package com.mnj.java_solutions.array

/**
 *
 * This problem is also the same as the famous “Dutch National Flag problem”.
 *
 *
 * Given an array nums with n objects colored red, white, or blue,
 *
 * sort them in-place so that objects of the same color are adjacent, with the colors in the order red, white, and blue.
 *
 * We will use the integers 0, 1, and 2 to represent the color red, white, and blue, respectively.
 *
 * Input: nums = [2,0,2,1,1,0]
 * Output: [0,0,1,1,2,2]
 */

/**

 * This algorithm contains 3 pointers i.e. low, mid, and high, and 3 main rules.  The rules are the following:

arr[0….low-1] contains 0. [Extreme left part]
arr[low….mid-1] contains 1.
arr[high+1….n-1] contains 2. [Extreme right part], n = size of the array
The middle part i.e. arr[mid….high] is the unsorted segment.

Here, as the entire array is unsorted, we have placed the mid pointer in the first index and the high
pointer in the last index. The low is also pointing to the first index as we have no other index before 0.
Here, we are mostly interested in placing the ‘mid’ pointer and the ‘high’ pointer as they represent the unsorted part in the hypothetical array.

The steps will be the following:

First, we will run a loop that will continue until mid <= high.
There can be three different values of mid pointer i.e. arr[mid]
If arr[mid] == 0, we will swap arr[low] and arr[mid] and will increment both low and mid. Now the subarray from index 0 to (low-1) only contains 0.
If arr[mid] == 1, we will just increment the mid pointer and then the index (mid-1) will point to 1 as it should according to the rules.
If arr[mid] == 2, we will swap arr[mid] and arr[high] and will decrement high. Now the subarray from index high+1 to (n-1) only contains 2.
In this step, we will do nothing to the mid-pointer as even after swapping, the subarray from mid to high(after decrementing high) might be unsorted. So, we will check the value of mid again in the next iteration.
Finally, our array should be sorted.

 */
class SortArrayOf0s1s2sLC75 {
    fun sort() {
        val arr = intArrayOf(1, 1, 0, 1, 2, 1, 0)
        var low = 0
        var mid = 0
        var high = arr.size - 1
        var temp: Int
        while (mid <= high) {
            when (arr[mid]) {
                0 -> {
                    temp = arr[low]
                    arr[low] = arr[mid]
                    arr[mid] = temp
                    low++
                    mid++
                }

                1 -> {
                    mid++
                }

                2 -> {
                    temp = arr[high]
                    arr[high] = arr[mid]
                    arr[mid] = temp
                    high--
                }
            }
        }
        for (n in arr) {
            println("==>> :$n")
        }
    }
}