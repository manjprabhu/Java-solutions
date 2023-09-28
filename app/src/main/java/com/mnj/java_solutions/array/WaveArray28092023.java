package com.mnj.java_solutions.array;

public class WaveArray28092023 {

    public void convertToWave() {
        int[] arr = {1, 2, 3, 4, 5};
        int n = arr.length;

        for (int i = 1; i < n; i += 2) {
            int c = arr[i];
            arr[i] = arr[i - 1];
            arr[i - 1] = c;
        }
    }
}
