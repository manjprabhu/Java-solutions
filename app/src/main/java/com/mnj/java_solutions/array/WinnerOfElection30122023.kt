package com.mnj.java_solutions.array

/**
 *
 * Given an array of n names arr of candidates in an election, where each name is a string of lowercase characters. A candidate name in the array represents a vote casted to the candidate. Print the name of the candidate that received the maximum count of votes. If there is a draw between two candidates, then print lexicographically smaller name.

Example 1:

Input:
n = 13
arr[] = {john,johnny,jackie,johnny,john
jackie,jamie,jamie,john,johnny,jamie,
johnny,john}
Output: john 4
Explanation: john has 4 votes casted for
him, but so does johny. john is
lexicographically smaller, so we print
john and the votes he received.
Example 2:

Input:
n = 3
arr[] = {andy,blake,clark}
Output: andy 1
Explanation: All the candidates get 1
votes each. We print andy as it is
lexicographically smaller.


 **/
class WinnerOfElection30122023 {
    fun winner(arr: Array<String?>?, n: Int): Array<String?>? {
        val hm: HashMap<String, Int> = HashMap()
        val res = arrayOfNulls<String>(2)
        var max = 0
        for (i in 0 until n) {
            hm[arr!![i]!!] = hm.getOrDefault(arr[i], 0) + 1
            max = Math.max(hm[arr[i]]!!, max)
        }

        for (key in hm.keys) {
            if (hm[key] === max) {
                if (res[0] == null) res[0] = key else {
                    if (res[0]!!.compareTo(key) > 0) res[0] = key
                }
            }
        }
        res[1] = max.toString()
        return res
    }
}