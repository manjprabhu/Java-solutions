package com.mnj.java_solutions.string;

import java.util.HashSet;

/**
 * Given a string s consisting of lowercase English letters, return the first letter to appear twice.
 *
 * Note:
 *
 * A letter a appears twice before another letter b if the second occurrence of a is before the second occurrence of b.
 * s will contain at least one letter that appears twice.
 *
 * Input: s = "abccbaacz"
 * Output: "c"
 * Explanation:
 * The letter 'a' appears on the indexes 0, 5 and 6.
 * The letter 'b' appears on the indexes 1 and 4.
 * The letter 'c' appears on the indexes 2, 3 and 7.
 * The letter 'z' appears on the index 8.
 * The letter 'c' is the first letter to appear twice, because out of all the letters the index of its second occurrence is the smallest.
 *
 * **/
public class FirstLetterToAppearTwiceLC2351 {

    public void repeatedCharacter() {
        String s = "abcdd";

        HashSet<Character> set = new HashSet<>();

        for (int i = 0; i < s.length(); i++) {
            if (!set.add(s.charAt(i))) {
                System.out.println("==>> First repeated char is :" + s.charAt(i));
                return;
            }
        }
    }
}
