package org.gb.algo;

/**
 *
 */
public class SinglyLinkedList {

    Node head;
    Node tail;

    public SinglyLinkedList() {
        head = null;
        tail = null;
    }

    public void addToHead(int value) {
        if (head == null) {
            head = new Node(value);
            tail = head;
            return;
        }

        head = new Node(value, head);
    }

    public void addToTail(int value) {
        if (tail == null) {
            head = new Node(value);
            tail = head;
            return;
        }

        tail.next = new Node(value);
        tail = tail.next;
    }

    /**
     * Задача 1.
     * Необходимо реализовать метод разворота связного списка (двухсвязного или односвязного на выбор).
     */
    public void reverse() {
        if (head == null || head == tail)
            return;

        var newHead = tail;
        tail = head;

        while (head != newHead) {
            var tmp = head.next;
            head.next = newHead.next;
            newHead.next = head;
            head = tmp;
        }
    }

    @Override
    public String toString() {
        if (head == tail) {
            return "empty";
        }

        var s = "";

        var cur = head;
        while (cur != null) {
            s = s + cur.value + " ";
            cur = cur.next;
        }

        return s;
    }

}
