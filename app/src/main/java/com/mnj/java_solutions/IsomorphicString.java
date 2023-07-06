package com.mnj.java_solutions;

import java.util.HashMap;
import java.util.HashSet;

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
