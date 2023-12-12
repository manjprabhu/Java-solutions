package com.mnj.java_solutions.linkedlist

import com.mnj.java_solutions.linkedlist.ListNode

class ReverseLinkedList {
    fun reverseLinkedList() {
        val node = ListNode()
        val head = node.insert()
        var curr = head
        var prev: ListNode.Node? = null
        while (curr != null) {
            val next = curr.next
            curr.next = prev
            prev = curr
            curr = next
        }
        node.display(prev)
    }
}