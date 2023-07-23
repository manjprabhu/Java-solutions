package com.mnj.java_solutions.array;

public class ThirdMaximumNumberLC414 {

    public void thirdMaximum() {

        int[] nums = { 3, 2, 1};
        Integer max = null;
        Integer second_max = null;
        Integer third_max = null;


        for (Integer num : nums) {

            if (num.equals(max) || num.equals(second_max) || num.equals(third_max)) {
                continue;
            }
            if (max == null || num > max) {
                third_max = second_max;
                second_max = max;
                max = num;
            } else if (second_max == null || num > second_max) {
                third_max = second_max;
                second_max = num;
            } else if (third_max == null || num > third_max) {
                third_max = num;
            }
        }

        if (third_max == null) {
            third_max = max;
        }


        System.out.println("==>>Third maximum element is:" + third_max);
    }
}
