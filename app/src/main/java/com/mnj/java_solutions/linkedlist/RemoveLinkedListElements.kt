package com.mnj.java_solutions.linkedlist

import com.mnj.java_solutions.linkedlist.ListNode

class RemoveLinkedListElements {
    fun removeElements() {
        val node = ListNode()
        var head = node.insert()
        val ele = 6
        while (head != null && head.data == ele) {
            head = head.next
        }
        var current_node = head
        while (current_node != null && current_node.next != null) {
            //If next element is element to be removed then just change the pointer
            // [1,2,6,3,4,5,6]
            // 2.next.next = 3;
            // after we remove element 6 then 2.next should point to 6;
            if (current_node.next.data == ele) {
                current_node.next = current_node.next.next
            } else {
                current_node = current_node.next
            }
        }
        node.display(head)
    }
}