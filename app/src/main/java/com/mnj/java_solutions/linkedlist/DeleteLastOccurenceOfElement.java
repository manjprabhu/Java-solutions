package com.mnj.java_solutions.linkedlist;

public class DeleteLastOccurenceOfElement {

    public void deleteLastOccurrence() {

        ListNode node = new ListNode();
        ListNode.Node head = node.insert();

        ListNode.Node deleteNode = null;
        ListNode.Node temp = head;
        ListNode.Node dummy = head;

        int key = 34;

        while (temp != null && temp.next!=null) {
            if (key == temp.data)
                deleteNode = temp;
            temp = temp.next;
        }

        // If key is not present in LinkedList
        if (deleteNode == null) {
            System.out.println("==>> Key is not present in list");
            return;
        }

        // If key is head node in LinkedList
        if (deleteNode == head) {
            System.out.println("==>> Key is header node in list");
            node.display(head.next);
            return;
        }

        // If key is last node in LinkedList
        if (deleteNode.next == null) {
            System.out.println("==>> Key is Last node in list");
            dummy = head;
            while (dummy.next.next != null) {
                dummy = dummy.next;
            }
            dummy.next = null;
            node.display(head);
            return;
        }

        System.out.println("==>> Key is somewhere in the list");
        deleteNode.data = deleteNode.next.data;
        deleteNode.next = deleteNode.next.next;

        node.display(head);
    }
}
