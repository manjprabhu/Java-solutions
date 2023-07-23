package com.mnj.java_solutions.array;

public class Segregate0sAnd1s {

    public void segregate() {
        int[] arr = {0, 1, 0, 0, 1, 1, 0};

        int low = 0;
        int high = arr.length - 1;

        while (low < high) {

            while (arr[low] == 0 && low < high) {
                low++;
            }

            while (arr[high] == 1 && low < high) {
                high--;
            }

            if (low < high) {
                arr[low] = 0;
                arr[high] = 1;
                low++;
                high--;
            }
        }
        for (int j : arr) {
            System.out.println("==>> :" + j);
        }

    }
}
