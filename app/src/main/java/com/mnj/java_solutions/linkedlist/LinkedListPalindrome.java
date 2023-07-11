package com.mnj.java_solutions.linkedlist;

import java.util.Stack;

public class LinkedListPalindrome {

    public void isPalindrome() {

        ListNode node = new ListNode();
        ListNode.Node head = node.insert();

        int length = getLength(head);

        Stack<Integer> stack = new Stack<>();

        ListNode.Node temp = head;
        int count = 0;

        while (count != length / 2) {
            stack.push(temp.data);
            count++;
            temp = temp.next;
        }

        while (temp.next != null) {
            if (stack.pop() != temp.data) {
                System.out.println("==>> LinkedList is NOT palindrome");
                return;
            }
            temp = temp.next;
        }

        if (stack.isEmpty()) {
            System.out.println("==>> LinkedList is Palindrome");
        }
    }

    //Here list is divided into 2 parts, after mid and both lists are traversed simultaneously and checked if elements are same.
    public void isPalindromeSolution() {

        ListNode node = new ListNode();
        ListNode.Node head = node.insert();

        ListNode.Node fast = head;
        ListNode.Node slow = head;

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }

        //For odd number of nodes, let right half smaller.
        if (fast != null)
            slow = slow.next;

        slow = reverseList(slow);
        fast = head;

        //Start comparing both list
        while (slow != null) {
            if (fast.data != slow.data) {
                System.out.println("==>> Linked list is NOT palindrome");
                return;
            }

            fast = fast.next;
            slow = slow.next;
        }

        System.out.println("==>> LinkedList is Palindrome");

    }

    ListNode.Node reverseList(ListNode.Node head) {
        ListNode.Node curr = head;
        ListNode.Node prev = null;
        ListNode.Node temp;

        while (curr != null) {
            temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }
        return prev;
    }

    private int getLength(ListNode.Node head) {
        int count = 0;
        while (head != null) {
            count++;
            head = head.next;
        }
        return count;
    }
}
