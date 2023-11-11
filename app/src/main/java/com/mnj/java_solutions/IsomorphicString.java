package com.mnj.java_solutions;

import java.util.HashMap;
import java.util.HashSet;

/**
 * Given two strings 'str1' and 'str2', check if these two strings are isomorphic to each other.
 * <p>
 * If the characters in str1 can be changed to get str2, then two strings, str1 and str2, are isomorphic. A character must be completely swapped out for another character while maintaining the order of the characters. A character may map to itself, but no two characters may map to the same character.
 * <p>
 * Example 1:
 * <p>
 * Input:
 * str1 = aab
 * str2 = xxy
 * Output:
 * 1
 * Explanation:
 * There are two different characters in aab and xxy, i.e a and b with frequency 2 and 1 respectively.
 * Example 2:
 * <p>
 * Input:
 * str1 = aab
 * str2 = xyz
 * Output:
 * 0
 * Explanation:
 * There are two different characters in aab but there are three different charactersin xyz. So there won't be one to one mapping between str1 and str2.
 **/
public class IsomorphicString {

    void isIsomorphic() {

        String str1 = "abcd";

        String str2 = "defa";

        HashMap<Character, Character> map = new HashMap<>();
        HashSet<Character> set = new HashSet<>();


        if (str1.length() != str2.length()) {
            System.out.println("==>> String are NOT isomorphic");
            return;
        }

        for (int i = 0; i < str1.length(); i++) {

            char c1 = str1.charAt(i);
            char c2 = str2.charAt(i);

            if (map.containsKey(c1)) {

                if (map.get(c1) != c2) {
                    System.out.println("==>> String are NOT isomorphic");
                    return;
                }
            } else {
                if (set.contains(c2)) {
                    System.out.println("==>> String are NOT isomorphic");
                    return;
                }
                map.put(c1, c2);
                set.add(c2);
            }
        }

        System.out.println("==>> String are isomorphic string");
    }

}
