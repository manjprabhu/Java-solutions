package com.mnj.java_solutions;

public class MostFrequentEvenNumber {

    void getMostFrequentEvenNumber() {
        int[] a = {29,47,21,41,13,37,25,7};//{4,4,4,9,2,4};//{0, 1, 2, 2, 4, 4, 1};

        int[] count = new int[100001];
        int frequency = 0;

        for (int i : a)
            count[i]++;

        for (int i = 0; i < count.length; i++) {
            if (i % 2 == 0 && count[i] > frequency)
                frequency = count[i];
        }
        System.out.println("==>> Most frequent even number is : " + frequency);
    }
}
