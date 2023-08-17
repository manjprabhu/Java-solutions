package com.mnj.java_solutions;

/**
 * Given a string containing digits from 2-9 inclusive, return all possible letter combinations that the number could represent.
 * Return the answer in any order.
 * <p>
 * A mapping of digits to letters (just like on the telephone buttons) is given below. Note that 1 does not map to any letters.
 * <p>
 * Input: digits = "23"
 * Output: ["ad","ae","af","bd","be","bf","cd","ce","cf"]
 * <p>
 * <p>
 * Input: digits = "2"
 * Output: ["a","b","c"]
 **/

public class LetterCombinationOfAPhoneNumberLC17 {

    private final String[] keypad = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};

    public void letterCombinations() {
        String s = "23";
        possibleWords(s, "");
    }

    private void possibleWords(String s, String result) {
        if (s.length() == 0) {
            System.out.println("==>>> Result is :" + result);
            return;
        }
        String key = keypad[s.charAt(0) - 48];

        for (int i = 0; i < key.length(); i++) {
            possibleWords(s.substring(1), result + key.charAt(i));
        }
    }
}
