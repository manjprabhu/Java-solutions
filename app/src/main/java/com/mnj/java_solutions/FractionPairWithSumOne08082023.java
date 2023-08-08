package com.mnj.java_solutions;

import java.util.HashMap;

public class FractionPairWithSumOne08082023 {

    public void countFractions() {
        int[] numerator = {3, 1, 12, 81, 2};
        int[] denominator = {9, 10, 18, 90, 5};
        int n = numerator.length;

        int count = 0;
        HashMap<String, Integer> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            int k = gcd(numerator[i], denominator[i]);
            int num = numerator[i] / k;
            int den = denominator[i] / k;

            String a = num + "/" + den;
            String d = den - num + "/" + den;

            if (map.containsKey(d)) {
                count = count + map.get(d);
            }
            map.put(a, map.getOrDefault(a, 0) + 1);
        }
        System.out.println("==>> number of pairs :" + count);
    }

    private int gcd(int a, int b) {
        if (a == 0)
            return b;
        return gcd(b % a, a);
    }
}
