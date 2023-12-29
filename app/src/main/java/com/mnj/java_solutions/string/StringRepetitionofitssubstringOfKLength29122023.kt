package com.mnj.java_solutions.string

/**
 *
 * Given a string s, check if it is possible to convert it into a string that is the repetition of a substring of length k. Conversion has to be done by following the steps mentioned below only once:

Select two indices i and j (zero-based indexing, i could be equal to j), such that i and j are divisible by k.
Select substrings of length k starting from indices i and j.
Replace substring starting at index i with substring starting at index j within the string.
Example 1:

Input:
N = 4
K = 2
S = "bdac"
Output: 1
Explanation: We can replace either
"bd" with "ac" or "ac" with "bd"
Example 2:

Input:
N = 5
K = 2
S = "abcde"
Output: 0
Explanation: Since n % k != 0, it's not
possible to convert s into a string which
is a concatanation of a substring with
length k.

 **/
class StringRepetitionofitssubstringOfKLength29122023 {

    fun kSubstrConcat(n: Int, s: String, k: Int): Int {
        if (n % k != 0) return 0
        val hm: HashMap<String, Int> = HashMap()
        var i = 0
        while (i < n) {
            val sub = s.substring(i, i + k)
            hm[sub] = hm.getOrDefault(sub, 0) + 1
            i += k
        }
        val x: Int = hm.size
        if (x == 1)
            return 1
        if (x == 2) for (`val` in hm.values) if (`val` == 1)
            return 1
        return 0
    }

}