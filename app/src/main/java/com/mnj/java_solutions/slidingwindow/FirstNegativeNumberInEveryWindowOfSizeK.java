package com.mnj.java_solutions.slidingwindow;

import java.util.ArrayList;
import java.util.Iterator;

public class FirstNegativeNumberInEveryWindowOfSizeK {

    public void firstNegativeNumber() {
        int[] arr = {-8, 2, 3, -6, 10};
        int k = 2, i = 0, j = 0;
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> result = new ArrayList<>();

        while (j < arr.length) {
            if (arr[j] < 0) {
                list.add(arr[j]);
            }

            if (j - i + 1 < k) {
                j++;
            } else if (j - i + 1 == k) {

                if (list.size() > 0) {
                    result.add(list.get(0));

                    if (list.contains(arr[i])) {
                        Iterator<Integer> itr = list.iterator();
                        while (itr.hasNext()) {
                            Integer number = itr.next();
                            if (number == arr[i]) {
                                itr.remove();
                            }
                        }
                    }
                } else {
                    result.add(0);
                }
                i++;
                j++;
            }
        }
        for (Integer integer : result) {
            System.out.println("==>> result is :" + integer);
        }
    }
}
