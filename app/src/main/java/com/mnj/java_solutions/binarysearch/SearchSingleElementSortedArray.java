package com.mnj.java_solutions.binarysearch;

import java.util.ArrayList;
import java.util.Arrays;

public class SearchSingleElementSortedArray {

    public void singleNonDuplicate() {

        int[] nums = {1, 1, 2, 2, 3, 3, 4, 4, 5};
        int result = -1;

        int n = nums.length;

        for (int i = 0; i <= n - 1; i++) {
            if (i == 0) {
                if (nums[i] != nums[i + 1]) {
                    result = nums[i];
                    break;
                }
            } else if (i == n - 1) {
                if (nums[i] != nums[i - 1]) {
                    result = nums[i];
                    break;
                }
            } else if (nums[i] != nums[i + 1] && nums[i] != nums[i - 1]) {
                result = nums[i];
                break;
            }
        }
        System.out.println("==>> First Non repeating element is:" + result);
    }


    /*
    * The index sequence of the duplicate numbers in the right half is always (odd, even).
    * That means one of the following conditions will be satisfied if we are in the right half:
    *
     1. If the current index is even, the element at the preceding odd index will be the same as the current element.
     2. If the current index is odd, the element at the next even index will be the same as the current element.
     *
     * */

    /* The index sequence of the duplicate numbers in the left half is always (even, odd).
          That means one of the following conditions will be satisfied if we are in the left half:
          1. If the current index is even, the element at the next odd index will be the same as the current element.
          2. If the current index is odd, the element at the preceding even index will be the same as the current element.*/
    public void singleNonDuplicate2() {

        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(2,2,4,4,7,7,8,9,9));
        int n = arr.size();

        if (n == 1)
            System.out.println("==>> First Non repeating element is:" + arr.get(0));
        if (!arr.get(0).equals(arr.get(1)))
            System.out.println("==>> First Non repeating element is:" + arr.get(0));
        if (!arr.get(n - 1).equals(arr.get(n - 2)))
            System.out.println("==>> First Non repeating element is:" + arr.get(n - 1));

        int low = 1, high = n - 2;
        while (low <= high) {
            int mid = (low + high) / 2;

            // If arr[mid] is the single element:
            if (!arr.get(mid).equals(arr.get(mid + 1)) && !arr.get(mid).equals(arr.get(mid - 1))) {
                System.out.println("==>> First Non repeating element is:" + arr.get(mid));
            }

            // We are in the left:
            if ((mid % 2 == 1 && arr.get(mid).equals(arr.get(mid - 1)))
                    || (mid % 2 == 0 && arr.get(mid).equals(arr.get(mid + 1)))) {

                low = mid + 1;
            }
            else {
                high = mid - 1;
            }
        }
    }
}
