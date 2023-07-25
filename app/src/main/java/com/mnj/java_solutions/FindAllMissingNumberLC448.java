package com.mnj.java_solutions;

import java.util.ArrayList;
import java.util.HashSet;

public class FindAllMissingNumberLC448 {

    public void findDisappearedNumbers() {
        int[] nums = {1, 1, 1};

        int n = nums.length;

        ArrayList<Integer> list = new ArrayList<>();

        HashSet<Integer> set = new HashSet<>();

        for (int i = 0; i < nums.length; i++)
            set.add(nums[i]);

        for (int i = 1; i <= n; i++) {
            if (!set.contains(i)) {
                list.add(i);
            }
        }

        for (int i = 0; i < list.size(); i++)
            System.out.println("==>> Disappeared numbers are :" + list.get(i));
    }

    public void findDisappearedNumbers2() {
        int[] nums = {4,3,2,7,8,2,3,1,1,10};

        int n = nums.length;
        ArrayList<Integer> list = new ArrayList<>();

        int[] count = new int[n+1];

        for(int num : nums) {
            count[num]++;
        }

        for(int i=1;i<count.length;i++) {
            if(count[i] == 0) {
                list.add(i);
            }
        }

        for (int i = 0; i < list.size(); i++)
            System.out.println("==>> Disappeared Numbers are :" + list.get(i));
    }
}
