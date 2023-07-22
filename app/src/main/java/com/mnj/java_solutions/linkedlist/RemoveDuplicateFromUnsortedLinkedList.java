package com.mnj.java_solutions.linkedlist;

import java.util.HashMap;

public class RemoveDuplicateFromUnsortedLinkedList {

    /**
     * first approach is  running 2 loops
     * 2nd approach is to sort the list first then remove the duplicate
     * 3rd approach is
     */
    public void removeDuplicate() {
        ListNode node = new ListNode();
        ListNode.Node head = node.insert();

        ListNode.Node prev = head;
        ListNode.Node temp = prev.next;

        if(head == null) {
            System.out.println("==>> Empty list");
            return;
        }

        HashMap<Integer, Boolean> map = new HashMap<>();
        map.put(head.data, true);

        while (temp != null) {
            if (!map.containsKey(temp.data)) {
                map.put(temp.data, true);
                temp = temp.next;
                prev = prev.next;
            } else {
                prev.next = temp.next;
                temp = temp.next;

            }
        }
        node.display(head);
    }
}
