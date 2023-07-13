package com.mnj.java_solutions.linkedlist;

import java.util.Stack;

public class PrintReverse {

    public void solutionOne() {

        ListNode node = new ListNode();
        ListNode.Node head = node.insert();
        ListNode.Node temp = head;

        Stack<Integer> stack = new Stack<>();

        while (temp != null) {
            stack.push(temp.data);
            temp = temp.next;
        }

        while (!stack.isEmpty()) {
            System.out.println("==>> " + stack.pop());
        }
    }

    public void solutionTwo() {
        ListNode node = new ListNode();
        ListNode.Node head = node.insert();
        reverse(head);
    }

    private void reverse(ListNode.Node head) {

        if (head.next == null)
            return;
        reverse(head.next);
        System.out.println("==>> Reverse List:" + head.data);


    }
}
