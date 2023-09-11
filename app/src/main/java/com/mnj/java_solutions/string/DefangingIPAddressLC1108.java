package com.mnj.java_solutions.string;

/**
 * Given a valid (IPv4) IP address, return a defanged version of that IP address.
 * <p>
 * A defanged IP address replaces every period "." with "[.]".
 * <p>
 * <p>
 * <p>
 * Example 1:
 * <p>
 * Input: address = "1.1.1.1"
 * Output: "1[.]1[.]1[.]1"
 * Example 2:
 * <p>
 * Input: address = "255.100.50.0"
 * Output: "255[.]100[.]50[.]0"
 **/
public class DefangingIPAddressLC1108 {

    public void defangIPaddr() {
        String address = "1.1.1.1";

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < address.length(); i++) {

            if (address.charAt(i) == '.') {
                sb.append('[');
                sb.append('.');
                sb.append(']');

            } else {
                sb.append(address.charAt(i));
            }
        }

        System.out.println("==>> Defanged IP address is :" + sb.toString());
    }
}
