package com.mnj.java_solutions.string

/***
 *
 * Given a string S consisting of the characters 0, 1 and 2. Your task is to find the length of the smallest substring of string S that contains all the three characters 0, 1 and 2. If no such substring exists, then return -1.

Example 1:

Input:
S = 10212
Output:
3
Explanation:
The substring 102 is the smallest substring
that contains the characters 0, 1 and 2.
Example 2:

Input:
S = 12121
Output:
-1
Explanation:
As the character 0 is not present in the
string S, therefor no substring containing
all the three characters 0, 1 and 2
exists. Hence, the answer is -1 in this case.

 */
class SmallestWindowContaining012s03012024 {

    fun smallestSubstring(S: String) {
        var zero = -1
        var one = -1
        var two = -1
        var res = 100001
        for (i in S.indices) {
            if (S[i] == '0') zero = i
            if (S[i] == '1') one = i
            if (S[i] == '2') two = i
            if (zero == -1 || one == -1 || two == -1) continue
            val min = Math.min(Math.min(one, zero), two)
            val max = Math.max(Math.max(one, zero), two)
            res = Math.min(res, max - min + 1)
        }
        if (res == 100001) {
            println("==>> No substring")
            return
        } else
            println("==>> Smallest substring $res")
    }
}