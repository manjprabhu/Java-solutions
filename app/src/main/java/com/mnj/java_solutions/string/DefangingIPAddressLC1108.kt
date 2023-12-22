package com.mnj.java_solutions.string

/**
 * Given a valid (IPv4) IP address, return a defanged version of that IP address.
 *
 * A defanged IP address replaces every period "." with "[.]".
 *
 * Example 1:
 *
 * Input: address = "1.1.1.1"
 * Output: "1[.]1[.]1[.]1"
 * Example 2:
 *
 * Input: address = "255.100.50.0"
 * Output: "255[.]100[.]50[.]0"
 */
class DefangingIPAddressLC1108 {
    fun defangIPaddr() {
        val address = "1.1.1.1"
        val sb = StringBuilder()
        for (i in address.indices) {
            if (address[i] == '.') {
                sb.append('[')
                sb.append('.')
                sb.append(']')
            } else {
                sb.append(address[i])
            }
        }
        println("==>> Defanged IP address is :$sb")
    }
}