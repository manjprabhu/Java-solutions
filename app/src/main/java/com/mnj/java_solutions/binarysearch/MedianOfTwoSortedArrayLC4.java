package com.mnj.java_solutions.binarysearch;

/**
 * Given two sorted arrays nums1 and nums2 of size m and n respectively, return the median of the two sorted arrays.
 * <p>
 * Input: nums1 = [1,3], nums2 = [2]
 * Output: 2.00000
 * Explanation: merged array = [1,2,3] and median is 2.
 **/
public class MedianOfTwoSortedArrayLC4 {

    public void medianOfSortedArray() {
        int[] arr1 = {1, 4, 7, 10, 12};
        int[] arr2 = {2, 3, 6, 15};
        int m = arr1.length;
        int n = arr2.length;


        int[] finalArray = new int[n + m];
        int i = 0, j = 0, k = 0;
        while (i < m && j < n) {
            if (arr1[i] < arr2[j]) {
                finalArray[k++] = arr1[i];
                i++;
            } else {
                finalArray[k++] = arr2[j];
                j++;
            }
        }
        if (i < m) {
            while (i < m) {
                finalArray[k++] = arr1[i];
                i++;
            }
        }
        if (j < n) {
            while (j < n) {
                finalArray[k++] = arr2[j];
                j++;
            }
        }

        n = n + m;

        if (n % 2 == 1)
            System.out.println("==>>> Median is :" + finalArray[((n + 1) / 2) - 1]);
        else
            System.out.println("==>>> Median is :" + ((double) finalArray[(n / 2) - 1] + (double) finalArray[(n / 2)]) / 2.0);
    }


    public void medianOfSortedArray2() {
        int[] arr1 = {1, 4, 7, 10, 12};
        int[] arr2 = {2, 3, 6, 15};
        int m = arr1.length;
        int n = arr2.length;
        System.out.println("==>>> Median is :" + median(arr1, arr2, m, n));
    }

    public double median(int arr1[], int arr2[], int m, int n) {
        if (m > n)
            return median(arr2, arr1, n, m);

        int low = 0, high = m, medianPos = ((m + n) + 1) / 2;
        while (low <= high) {
            int cut1 = (low + high) >> 1;
            int cut2 = medianPos - cut1;

            int l1 = (cut1 == 0) ? Integer.MIN_VALUE : arr1[cut1 - 1];
            int l2 = (cut2 == 0) ? Integer.MIN_VALUE : arr2[cut2 - 1];
            int r1 = (cut1 == m) ? Integer.MAX_VALUE : arr1[cut1];
            int r2 = (cut2 == n) ? Integer.MAX_VALUE : arr2[cut2];

            if (l1 <= r2 && l2 <= r1) {
                if ((m + n) % 2 != 0)
                    return Math.max(l1, l2);
                else
                    return (Math.max(l1, l2) + Math.min(r1, r2)) / 2.0;
            } else if (l1 > r2) high = cut1 - 1;
            else low = cut1 + 1;
        }
        return 0.0;
    }
}
