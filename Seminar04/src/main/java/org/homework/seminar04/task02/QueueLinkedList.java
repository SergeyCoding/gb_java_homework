package org.homework.seminar04.task02;

import java.util.Arrays;
import java.util.LinkedList;

/**
 * 2. Реализуйте очередь с помощью LinkedList со следующими методами:enqueue() - помещает
 * элемент в конец очереди, dequeue() - возвращает первый элемент из очереди и удаляет его,
 * first() - возвращает первый элемент из очереди, не удаляя.
 */
public class QueueLinkedList {

    private final LinkedList<Integer> list = new LinkedList<>();

    public QueueLinkedList() {
    }

    public void enqueue(int e) {
        list.addLast(e);
    }

    public int dequeue() {
        return list.removeFirst();
    }

    public Integer first() {
        return list.getFirst();
    }

    @Override
    public String toString() {
        return Arrays.toString(list.toArray());
    }
}
