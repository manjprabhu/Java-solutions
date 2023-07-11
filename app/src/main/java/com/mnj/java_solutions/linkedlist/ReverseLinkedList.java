package com.mnj.java_solutions.linkedlist;

public class ReverseLinkedList {

    public void reverseLinkedList() {

        ListNode node = new ListNode();
        ListNode.Node head = node.insert();

        ListNode.Node curr = head;
        ListNode.Node prev = null;
        ListNode.Node temp;

        while (curr != null) {
            temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }

        node.display(prev);
    }
}
