package com.mnj.java_solutions.linkedlist;

/**
 * Given a singly linked list, remove all the nodes in the list which have any node on their right whose value is greater.
 * <p>
 * (Not just immidiate Right , but entire List on the Right)
 *
 * Input:
 * LinkedList = 12->15->10->11->5->6->2->3
 * Output: 15 11 6 3
 *
 * Explanation: Since, 12, 10, 5 and 2 are the elements which have greater elements
 * on the following nodes. So, after deleting them, the linked list would like be 15, 11, 6, 3.
 *
 **/

public class DeleteNodeHavingGreaterValueOnRight29082023 {

    public void delete() {
        ListNode node = new ListNode();
        ListNode.Node head = node.insert();

        head = reverse(head);
        ListNode.Node temp = head;

        while (temp != null && temp.next != null) {
            if (temp.data > temp.next.data) {
                temp.next = temp.next.next;
            } else {
                temp = temp.next;
            }
        }
        node.display(reverse(head));
    }

    private ListNode.Node reverse(ListNode.Node head) {
        ListNode.Node curr = head;
        ListNode.Node prev = null;

        while (curr != null) {
            ListNode.Node next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
    }
}
