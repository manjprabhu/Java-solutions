package com.mnj.java_solutions.linkedlist;

public class OddEvenLinkedListLC328 {

    public void oddEvenList() {

        ListNode node = new ListNode();
        ListNode.Node head = node.insert();

        ListNode.Node odd = head;
        ListNode.Node even = head.next;

        ListNode.Node evenHead = even;

        while (even != null && even.next != null) {
            odd.next = odd.next.next;
            odd = odd.next;

            even.next = even.next.next;
            even = even.next;
        }

        odd.next = evenHead;

        node.display(head);
    }
}
