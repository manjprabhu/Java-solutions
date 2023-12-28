package com.mnj.java_solutions.string

/***
 * Given two strings wild and pattern. Determine if the given two strings can be matched given that, wild string may contain * and ? but string pattern will not. * and ? can be converted to another character according to the following rules:

 * --> This character in string wild can be replaced by any sequence of characters, it can also be replaced by an empty string.
? --> This character in string wild can be replaced by any one character.
Example 1:

Input:
wild = ge*ks
pattern = geeks
Output: Yes
Explanation: Replace the '*' in wild string
with 'e' to obtain pattern "geeks".
Example 2:

Input:
wild = ge?ks*
pattern = geeksforgeeks
Output: Yes
Explanation: Replace '?' and '*' in wild string with
'e' and 'forgeeks' respectively to obtain pattern
"geeksforgeeks"

 */
class WildCardStringMatching28122023 {

    fun match(): Boolean {
        val wild = "ge*ks"
        val pattern = "geeks"

        val n = wild.length
        val m = pattern.length
        val arr = Array(n + 1) {
            IntArray(
                m + 1
            )
        }
        arr[n][m] = 1
        for (i in n - 1 downTo 0) {
            var j = m - 1
            while (j >= 0) {
                if (wild[i] == pattern[j]) {
                    if (arr[i + 1][j + 1] == 1) arr[i][j] = 1
                }
                if (wild[i] == '*' && (arr[i + 1][j] == 1 || arr[i + 1][j + 1] == 1)) {
                    while (j-- > 0) {
                        arr[i][j] = 1
                    }
                }
                if (wild[i] == '?' && arr[i + 1][j + 1] == 1) {
                    arr[i][j] = 1
                }
                j--
            }
        }
        return arr[0][0] == 1
    }
}