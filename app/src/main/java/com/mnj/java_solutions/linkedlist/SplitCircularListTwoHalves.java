package com.mnj.java_solutions.linkedlist;

public class SplitCircularListTwoHalves {

    public void circularIntoTwoHalves() {

        ListNode node = new ListNode();
        ListNode.Node head = node.insert();

        ListNode.Node fast_ptr = head;
        ListNode.Node slow_ptr = head;

        ListNode.Node head2 = head;
        ListNode.Node head1 = head;

        while (fast_ptr.next != head
                && fast_ptr.next.next != head) {
            fast_ptr = fast_ptr.next.next;
            slow_ptr = slow_ptr.next;
        }

        /* If there are even elements in list then move
         * fast_ptr */
        if (fast_ptr.next.next == head) {
            fast_ptr = fast_ptr.next;
        }

        /* Set the head pointer of second half */
        if (head.next != head) {
            head2 = slow_ptr.next;
        }
        /* Make second half circular */
        fast_ptr.next = slow_ptr.next;

        /* Make first half circular */
        slow_ptr.next = head;


        printList(head1);

        System.out.println("==>> Second linked list :");
        printList(head2);

    }

    void printList(ListNode.Node node) {
        ListNode.Node temp = node;
        if (node != null) {
            do {
                System.out.println(temp.data + "==>> ");

                temp = temp.next;
            } while (temp != node);
        }
    }
}
