package com.mnj.java_solutions;

/**
 * Given two numbers as strings s1 and s2. Calculate their Product.
 * <p>
 * Input:
 * s1 = "0033"
 * s2 = "2"
 * Output:
 * 66
 **/
public class MultiplyStrings24082023 {

    public void multiplyStrings() {
        String s1 = "0033";
        String s2 = "2";

        int length1 = s1.length();
        int length2 = s2.length();

        int a = s1.charAt(0) == '-' ? -1 : 0;
        int b = s2.charAt(0) == '-' ? -1 : 0;

        int[] arr = new int[length1 + length2];

        for (int i = length1 - 1; i >= 0; i--) {
            int k = i + length2;

            if (s1.charAt(i) != '-') {
                int carry = 0;
                for (int j = length2 - 1; j >= 0; j--) {
                    if (s2.charAt(j) != '-') {

                        int x = (s1.charAt(i) - '0') * (s2.charAt(j) - '0') + carry + arr[k];
                        arr[k] = x % 10;
                        carry = x / 10;
                        k--;
                    }
                }
                if (carry > 0) {
                    arr[k] = carry;
                }
            }
        }
        boolean flag = true;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < length1 + length2; i++) {
            while (i < length1 + length2 && flag == true && arr[i] == 0) {
                i++;
            }
            flag = false;
            if (i < length1 + length2) sb.append(arr[i]);
        }
        String str = sb.toString();
        if (a < 0 && b >= 0 || a >= 0 && b < 0) str = "-" + str;
        if (str.length() == 0)
            System.out.println("Product is ZERO" + "0");
        System.out.println("Product is " + str);
    }
}
