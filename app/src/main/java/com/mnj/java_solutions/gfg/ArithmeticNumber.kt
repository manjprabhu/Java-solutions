package com.mnj.java_solutions.gfg

class ArithmeticNumber {
    fun inSequence() {
        val A = 1
        val B = 3
        val C = 2
        var x = A
        while (Math.abs(x) <= Math.abs(B)) {
            if (x == B) {
                println("==>> B exists in arithmetic sequence ...")
                return
            }
            x += C
        }
        println("==>> B Does NOT exists in arithmetic sequence ...")
    }

    fun inSequence2() {
        val A = -2
        val B = -9
        val C = -7
        // example sequence is -2, -9, -16 ,-23 .....
//        int A = 1, B = 3, C = 2;
//  example sequence is 1, 3, 5,7 ....
        if (A == B) {
            println("==>> B exists in arithmetic sequence ...")
            return
        }

        // This gurantees this is valid arithmetic sequence
        if (B > A && C > 0 || B < A && C < 0) {

            //diff b/w two number in sequence  =  multiple of common diff
            if ((B - A) % C == 0) {
                println("==>> B exists in arithmetic sequence ...")
                return
            }
        }
        println("==>> B Does NOT exists in arithmetic sequence ...")
    }
}
