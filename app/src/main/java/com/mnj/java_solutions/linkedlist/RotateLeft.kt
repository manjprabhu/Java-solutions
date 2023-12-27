package com.mnj.java_solutions.linkedlist

import com.mnj.java_solutions.linkedlist.ListNode

class RotateLeft {
    fun rotateLeft() {
        val node = ListNode()
        var head = node.insert()
        var temp = head
        var last: ListNode.Node? = null
        var count = 1
        val k = 2
        while (temp.next != null) {
            if (count == k) last = temp
            count++
            temp = temp.next
        }
        if (k < count) {
            temp.next = head
            head = last!!.next
            last.next = null
        }
        node.display(head)
    }
}