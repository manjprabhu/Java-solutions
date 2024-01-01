package com.mnj.java_solutions.array

/**
 * Given an array of integers nums and a number k, write a function that returns true if given array can be divided into pairs such that sum of every pair is divisible by k.

Example 1 :

Input :
nums = [9, 5, 7, 3]
k = 6
Output:
True
Explanation:
{(9, 3), (5, 7)} is a
possible solution. 9 + 3 = 12 is divisible
by 6 and 7 + 5 = 12 is also divisible by 6.
Example 2:

Input :
nums = [4, 4, 4]
k = 4
Output:
False
Explanation:
You can make 1 pair at max, leaving a single 4 unpaired.
 **/
class ArrayPairSumDivisibilityProblem01012024 {

    fun canPair() {
        var nums = intArrayOf(9, 5, 7, 3)
        val k = 6

        val arr = IntArray(k)
        for (element in nums) arr[element % k]++

        if (arr[0] % 2 == 1) {
            println("==>> FALSE")
            return
        }
        var i = 1
        var j = k - 1

        while (i <= j) {
            if (arr[i] != arr[j]) {
                println("==>> FALSE")
                return
            }
            i++
            j--
        }
        println("==>> TRUE")
    }
}