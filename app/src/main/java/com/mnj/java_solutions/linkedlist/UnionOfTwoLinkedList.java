package com.mnj.java_solutions.linkedlist;

import java.util.Set;
import java.util.TreeSet;

/**
 * Given two linked lists, your task is to complete the function makeUnion(), that returns the union list of two linked lists. This union list should include all the distinct elements only and it should be sorted in ascending order.
 *
 * Example 1:
 *
 * Input:
 * L1 = 9->6->4->2->3->8
 * L2 = 1->2->8->6->2
 * Output:
 * 1 2 3 4 6 8 9
 * Explanation:
 * All the distinct numbers from two lists, when sorted forms the list in the output.
 * Example 2:
 *
 * Input:
 * L1 = 1->5->1->2->2->5
 * L2 = 4->5->6->7->1
 * Output:
 * 1 2 4 5 6 7
 * Explanation:
 * All the distinct numbers from two lists, when sorted forms the list in the output.
 * **/
public class UnionOfTwoLinkedList {

    public void findUnion() {
        ListNode node = new ListNode();
        ListNode.Node l1 = node.sortedListOne();
        ListNode.Node l2 = node.sortedListTwo();

        Set<Integer> set = new TreeSet<>();
        while (l1 != null) {
            set.add(l1.data);
            l1 = l1.next;
        }

        while (l2 != null) {
            set.add(l2.data);
            l2 = l2.next;
        }
        ListNode.Node curr = null;
        ListNode.Node start = null;

        for (int x : set) {
            if (start == null) // will run just once
            {
                start = new ListNode.Node(x);
                curr = start;
            } else {
                curr.next = new ListNode.Node(x);
                curr = curr.next;
            }
        }

        System.out.println("==>> Result *****************");
        node.display(start);
    }
}
