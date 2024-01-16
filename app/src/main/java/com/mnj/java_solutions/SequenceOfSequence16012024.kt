package com.mnj.java_solutions

/**
 * Given two integers m and n, try making a special sequence of numbers seq of length n such that

seqi+1 >= 2*seqi
seqi > 0
seqi <= m
Your task is to determine total number of such special sequences possible.

Example 1:

Input:
m = 10
n = 4
Output:
4
Explanation:
There should be n elements and
value of last element should be at-most m.
The sequences are {1, 2, 4, 8}, {1, 2, 4, 9},
{1, 2, 4, 10}, {1, 2, 5, 10}.
Example 2:

Input:
m = 5
n = 2
Output:
6
Explanation:
The sequences are {1, 2},
{1, 3}, {1, 4}, {1, 5}, {2, 4}, {2, 5}.
 **/
class SequenceOfSequence16012024 {

    fun numberSequence(m: Int, n: Int): Int {

        if (m < n)
            return 0
        return if (n == 0) 1
        else numberSequence(m / 2, n - 1) + numberSequence(m - 1, n)
    }
}