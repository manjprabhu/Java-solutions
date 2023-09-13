package com.mnj.java_solutions.twopointer;

/**
 * Given a 0-indexed string word and a character ch, reverse the segment of word that starts at index 0 and ends at the index of the first occurrence of ch (inclusive). If the character ch does not exist in word, do nothing.
 * <p>
 * For example, if word = "abcdefd" and ch = "d", then you should reverse the segment that starts at 0 and ends at 3 (inclusive). The resulting string will be "dcbaefd".
 * Return the resulting string.
 * <p>
 * <p>
 * <p>
 * Example 1:
 * <p>
 * Input: word = "abcdefd", ch = "d"
 * Output: "dcbaefd"
 * Explanation: The first occurrence of "d" is at index 3.
 * Reverse the part of word from 0 to 3 (inclusive), the resulting string is "dcbaefd".
 * Example 2:
 * <p>
 * Input: word = "xyxzxe", ch = "z"
 * Output: "zxyxxe"
 * Explanation: The first and only occurrence of "z" is at index 3.
 * Reverse the part of word from 0 to 3 (inclusive), the resulting string is "zxyxxe".
 **/
public class ReversePrefixWordLC2000 {

    public void reversePrefix() {

        String word = "xyxzxe", ch = "z";

        int i = word.indexOf(ch);

        if (i == -1) {
            System.out.println("==>> Result is  :" + word);
            return;
        }

        char[] res = new char[i + 1];
        for (int j = i; j > -1; j--)
            res[i - j] = word.charAt(j);

        System.out.println("==>> Result is  :" + (new String(res) + word.substring(i + 1)));
    }
}
