package com.mnj.java_solutions.linkedlist;

public class ReverseLinkedList {

    public void reverseLinkedList() {

        ListNode node = new ListNode();
        ListNode.Node head = node.insert();

        ListNode.Node curr = head;
        ListNode.Node prev = null;

        while (curr != null) {
            ListNode.Node next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        node.display(prev);
    }
}
