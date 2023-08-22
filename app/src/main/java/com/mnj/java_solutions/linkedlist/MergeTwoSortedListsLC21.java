package com.mnj.java_solutions.linkedlist;

/**
 * You are given the heads of two sorted linked lists list1 and list2.
 * <p>
 * Merge the two lists into one sorted list. The list should be made by splicing together the nodes of the first two lists.
 * <p>
 * Return the head of the merged linked list.
 * <p>
 * Input: list1 = [1,2,4], list2 = [1,3,4]
 * Output: [1,1,2,3,4,4]
 **/

public class MergeTwoSortedListsLC21 {

    public void mergeTwoLists() {
        ListNode node = new ListNode();
        ListNode.Node l1 = node.sortedListOne();
        ListNode.Node l2 = node.sortedListTwo();

        ListNode.Node result = new ListNode.Node(0);
        ListNode.Node temp = result;

        while (l1 != null && l2 != null) {
            if (l1.data < l2.data) {
                temp.next = l1;
                l1 = l1.next;
            } else {
                temp.next = l2;
                l2 = l2.next;
            }
            temp = temp.next;
        }
        if (l1 == null) {
            temp.next = l2;
        }
        if (l2 == null) {
            temp.next = l1;
        }
        node.display(result);
    }
}
