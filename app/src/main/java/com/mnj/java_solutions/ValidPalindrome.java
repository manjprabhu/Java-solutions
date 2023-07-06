package com.mnj.java_solutions;

import java.util.Locale;

public class ValidPalindrome {

    /*A phrase is a palindrome if, after converting all uppercase letters into lowercase letters
    and removing all non-alphanumeric characters,
    it reads the same forward and backward. Alphanumeric characters include letters and numbers.*/

    void isValidPalindrome() {

        String str = "A man, a plan, a canal: Panama";

        String fixed_String = "";

        for (Character c : str.toCharArray()) {

            if (Character.isDigit(c) || Character.isLetter(c)) {
                fixed_String += c;
            }
        }


        int start = 0;
        int end = fixed_String.length() - 1;
        fixed_String = fixed_String.toLowerCase();

        while (start <= end) {

            if (fixed_String.charAt(start) != fixed_String.charAt(end)) {
                System.out.println("==>> String is NOT palindrome");
                return;
            } else {
                start++;
                end--;
            }
        }

        System.out.println("==>> String is Palindrome");
    }
}
