package com.mnj.java_solutions.gfg;

public class IshanLovesChocolate {

    public void chocolates() {

        int[] arr = {5, 9, 2, 6};

        int min = 0;
        int max = arr.length - 1;

        while (min < max) {

            if (arr[max] > arr[min]) {
                max--;
            } else {
                min++;
            }
        }
        System.out.println("==>> Chhocolate is:" + arr[min]);
    }
}
