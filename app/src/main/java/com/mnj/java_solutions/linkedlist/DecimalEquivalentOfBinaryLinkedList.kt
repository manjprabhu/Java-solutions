package com.mnj.java_solutions.linkedlist

/**
 * Given a singly linked list of length n. The link list represents a binary number, ie- it contains only 0s and 1s. Find its decimal equivalent.
 * The significance of the bits decreases with the increasing index in the linked list.
 * An empty linked list is considered to represent the decimal value 0.
 *
 *
 * Since the answer can be very large, answer modulo 109+7 should be printed.
 *
 *
 * Example 1:
 * Input:
 * n = 3
 * Linked List = {0, 1, 1}
 * Output:
 * 3
 * Explanation:
 * 0*22 + 1*21 + 1*20 =  1 + 2 + 0 = 3
 * Example 2:
 * Input:
 * n = 4
 * Linked List = {1, 1, 1, 0}
 * Output:
 * 14
 * Explanation:
 * 1*23 + 1*22 + 1*21 + 0*20 =  8 + 4 + 2 + 0 = 14
 */
class DecimalEquivalentOfBinaryLinkedList {
    fun decimalValue() {
        val node = ListNode()
        var head = node.insert()
        var res: Long = 0
        val mod = 1000000007
        while (head != null) {
            res = (res shl 1) % mod
            res = (res + head.data) % mod
            head = head.next
        }
        println("Result : $res")
    }
}
