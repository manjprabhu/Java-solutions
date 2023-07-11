package com.mnj.java_solutions.linkedlist;

public class ListNode {

    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public Node insert() {
        Node l1 = new Node(4);
        Node l2 = new Node(8);
        Node l3 = new Node(15);
        Node l4 = new Node(16);
        Node l5 = new Node(10);
        Node l6 = new Node(11);
        Node l7 = new Node(13);

        l1.next = l2;
        l2.next = l3;
        l3.next = l4;
        l4.next = l5;
        l5.next = l6;
        l6.next = l7;
        l7.next = l4;
        return l1;
    }
}
