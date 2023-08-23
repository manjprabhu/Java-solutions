package com.mnj.java_solutions.linkedlist;

public class MiddleOfLinkedList {

    public void middleNode() {
        ListNode node = new ListNode();
        ListNode.Node head = node.insert();

        ListNode.Node fast = head;
        ListNode.Node slow = head;

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        System.out.println("==>> Middle of linked list is :" + slow.data);
    }
}