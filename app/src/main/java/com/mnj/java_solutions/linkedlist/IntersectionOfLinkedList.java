package com.mnj.java_solutions.linkedlist;

public class IntersectionOfLinkedList {

    void intersectionNode() {

    }


    private int getLength(ListNode.Node head) {
        int count  =0;
        while (head!=null) {
            count++;
            head = head.next;
        }
        return count;
    }
}
