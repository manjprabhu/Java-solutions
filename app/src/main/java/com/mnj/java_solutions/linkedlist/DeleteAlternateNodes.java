package com.mnj.java_solutions.linkedlist;

public class DeleteAlternateNodes {

    public void deleteNodes() {
        ListNode node = new ListNode();
        ListNode.Node head = node.insert();

        ListNode.Node temp = head;

        while (temp != null && temp.next != null) {
            temp.next = temp.next.next;
            temp = temp.next;
        }

        System.out.println("==>> After operation.....");
        node.display(head);
    }
}
