package com.mnj.java_solutions.gfg;

public class NumberOfOneBits {

    public void setBits() {

        int n = 10;
        int count =0;

        while(n !=0) {

            int r = n % 2;

            if(r ==1)  {
                count++;
            }
            n = n/2;
        }

        System.out.println("==>> Number of 1 bits:"+count);
    }
}
