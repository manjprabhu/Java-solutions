package com.mnj.java_solutions.string;

/**
 * We define the usage of capitals in a word to be right when one of the following cases holds:
 * <p>
 * All letters in this word are capitals, like "USA".
 * All letters in this word are not capitals, like "leetcode".
 * Only the first letter in this word is capital, like "Google".
 * Given a string word, return true if the usage of capitals in it is right.
 * <p>
 * <p>
 * <p>
 * Example 1:
 * <p>
 * Input: word = "USA"
 * Output: true
 * Example 2:
 * <p>
 * Input: word = "FlaG"
 * Output: false
 **/
public class DetectTheCapitalLC520 {

    public void detectCapitalUse() {
        String str = "USAn";
        if (Character.isUpperCase( str.charAt(0))) {
            if (Character.isUpperCase(str.charAt(1))) {
                for (int i = 2; i < str.length(); i++) {
                    if (Character.isLowerCase(str.charAt(i))) {
                        System.out.println("==>> False");
                        return;
                    }
                }
            } else {
                for (int i = 2; i < str.length(); i++) {
                    if (Character.isUpperCase(str.charAt(i))) {
                        System.out.println("==>> False");
                        return;
                    }
                }
            }
        } else {
            for (int i = 0; i < str.length(); i++) {
                if (Character.isUpperCase(str.charAt(i))) {
                    System.out.println("==>> False");
                    return;
                }
            }
        }
        System.out.println("==>> True");
    }
}
