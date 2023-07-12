package com.mnj.java_solutions.linkedlist;

public class MoveLastElementToFirst {

    public void move() {
        ListNode node = new ListNode();
        ListNode.Node head = node.insert();

        ListNode.Node temp = head;

        //traverse the list until 2nd last element
        while (temp.next.next != null) {
            temp = temp.next;
        }

        //save the last node.
        ListNode.Node last = temp.next;

        //temp will be new last node so mark next of temp to zero.
        temp.next = null;

        last.next = head;

        node.display(last);
    }
}
