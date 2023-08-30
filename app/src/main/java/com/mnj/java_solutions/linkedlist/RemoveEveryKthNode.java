package com.mnj.java_solutions.linkedlist;

public class RemoveEveryKthNode {

    public void deleteNode() {
        int k = 3;

        ListNode node = new ListNode();
        ListNode.Node head = node.insert();

        ListNode.Node temp = head;
        ListNode.Node prev = null;

        if (head == null) {
            System.out.println("==>> Empty list");
            return;
        }

        if (k == 1) {
            head = freeList(head);
            return;
        }

        int count = 0;

        while (temp != null) {
            count++;
            if (count == k) {
                //  assign address of next node of
                // current node to the previous node
                // of the current node.
                prev.next = temp.next;
                count = 0;
            }

//            Update prev node if count != 0 and if
//            count is 0 that means that node is a
//            starting point.
            if (count != 0)
                prev = temp;
            temp = temp.next;
        }
    }

    private ListNode.Node freeList(ListNode.Node node) {
        while (node != null) {
            ListNode.Node next = node.next;
            node = next;
        }
        return node;
    }
}
