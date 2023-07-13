package com.mnj.java_solutions.linkedlist;

public class DeleteWithoutHeadNode {

    public void delete() {
        ListNode node = new ListNode();
        ListNode.Node deleteNode = node.insert();

        deleteNode.data = deleteNode.next.data;
        deleteNode.next = deleteNode.next.next;

    }
}
