package com.mnj.java_solutions.gfg

import java.util.*

class ConvertAnArrayReducedForm {
    fun convert() {
        val arr = intArrayOf(10, 40, 20)
        val map = HashMap<Int, Int>()
        val temp = IntArray(arr.size)

        //Create a copy array
        for (i in arr.indices) {
            temp[i] = arr[i]
        }
        //sort the array
        Arrays.sort(temp)

        //Create a map (key will array element, and value will be index)
        for (i in temp.indices) map[temp[i]] = i

        //Query every given element and find its index in sorted array.
        for (i in arr.indices) {
            arr[i] = map[arr[i]]!!
        }
        for (num in arr) {
            println("==>> New Array is:$num")
        }
    }
}