package com.mnj.java_solutions.linkedlist;

import java.util.ArrayList;
import java.util.Stack;

public class NextGreaterNodeInLinkedListLC1019 {

    public void nextGreaterElement() {

        ListNode node = new ListNode();
        ListNode.Node head = node.insert();

        ArrayList<Integer> list = new ArrayList<>();
        ListNode.Node temp = head;

        while (temp != null) {
            list.add(temp.data);
            temp = temp.next;
        }

        Stack<Integer> stack = new Stack<>();

        for (int i = list.size()-1; i >= 0; i--) {
            while (!stack.isEmpty() && stack.peek() <= list.get(i)) {
                stack.pop();
            }
            if (stack.isEmpty()) {
                System.out.println("==>> Next greater element of " + list.get(i) + " is " + 0);
            } else {
                System.out.println("==>> Next greater element of " + list.get(i) + " is " + stack.peek());
            }
            stack.push(list.get(i));
        }

    }
}
