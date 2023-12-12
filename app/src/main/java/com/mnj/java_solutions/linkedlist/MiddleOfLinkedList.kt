package com.mnj.java_solutions.linkedlist

import com.mnj.java_solutions.linkedlist.ListNode

class MiddleOfLinkedList {
    fun middleNode() {
        val node = ListNode()
        val head = node.insert()
        var fast = head
        var slow = head
        while (fast?.next != null) {
            fast = fast.next.next
            slow = slow.next
        }
        println("==>> Middle of linked list is :" + slow.data)
    }
}