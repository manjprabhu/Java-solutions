package com.mnj.java_solutions.twopointer;

/**
 * Given a string s, reverse the string according to the following rules:
 * <p>
 * All the characters that are not English letters remain in the same position.
 * All the English letters (lowercase or uppercase) should be reversed.
 * Return s after reversing it.
 * <p>
 * <p>
 * <p>
 * Example 1:
 * <p>
 * Input: s = "ab-cd"
 * Output: "dc-ba"
 * Example 2:
 * <p>
 * Input: s = "a-bC-dEf-ghIj"
 * Output: "j-Ih-gfE-dCba"
 **/
public class ReverseOnlyLettersLC917 {

    public void reverseOnlyLetters() {

        String s = "ab-cd";
        char[] array = s.toCharArray();
        int i = 0;
        int j = array.length - 1;

        while (i <= j) {
            if (Character.isAlphabetic(array[i]) && Character.isAlphabetic(array[j])) {
                char temp = array[i];
                array[i] = array[j];
                array[j] = temp;
                i++;
                j--;
            } else if (!Character.isAlphabetic(array[i])) {
                i++;
            } else if (!Character.isAlphabetic(array[j])) {
                j--;
            }
        }

        System.out.println("==>> Result string is  :" + String.valueOf(array));

    }
}
