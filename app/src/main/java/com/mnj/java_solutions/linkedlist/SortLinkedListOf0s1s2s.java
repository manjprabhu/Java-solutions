package com.mnj.java_solutions.linkedlist;

public class SortLinkedListOf0s1s2s {

    public void sort() {

        ListNode node = new ListNode();
        ListNode.Node head = node.insert();

        int[] count = new int[3];

        ListNode.Node temp = head;

        for (ListNode.Node curr = head; curr != null; curr = curr.next) {
            if (curr.data == 0)
                count[0]++;
            else if (curr.data == 1) {
                count[1]++;
            } else if (curr.data == 2) {
                count[2]++;
            }
        }

        int index = 0;
        while (temp != null) {
            if (count[index] == 0)
                index++;
            else if (count[index] != 0) {
                temp.data = index;
                count[index]--;
                temp = temp.next;
            }
        }
        node.display(head);
    }
}
