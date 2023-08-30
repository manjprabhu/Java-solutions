package com.mnj.java_solutions.twopointer;

public class SeparateOddAndEvenNumberInAnArray {

    public void separateEvenAndOdd() {
        int[] arr = {4, 8, 15, 16, 23, 42};

        int evenPtr = 0;
        int oddPtr = arr.length - 1;

        while (evenPtr < oddPtr) {

            // Keep incrementing left index, until the number at that index is even
            while (arr[evenPtr] % 2 == 0 && evenPtr < oddPtr) {
                evenPtr++;
            }

            //Keep decrementing right index until the number at that index is odd
            while (arr[oddPtr] % 2 != 0 && evenPtr < oddPtr) {
                oddPtr--;
            }

            if (evenPtr < oddPtr) {
                int temp = arr[evenPtr];
                arr[evenPtr] = arr[oddPtr];
                arr[oddPtr] = temp;
                evenPtr++;
                oddPtr--;
            }
        }
        System.out.println("==>>  ******************** Result Array is ********************");
        for (int num : arr)
            System.out.println("==>> " + num);
    }
}
