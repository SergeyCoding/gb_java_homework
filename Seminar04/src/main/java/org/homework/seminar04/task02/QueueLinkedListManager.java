package org.homework.seminar04.task02;

/**
 * 2. Реализуйте очередь с помощью LinkedList со следующими методами:enqueue() - помещает
 * элемент в конец очереди, dequeue() - возвращает первый элемент из очереди и удаляет его,
 * first() - возвращает первый элемент из очереди, не удаляя.
 */
public class QueueLinkedListManager {
    public static void run() {
        System.out.println("\nСеминар 4.");
        System.out.println("Задача 2.");

        var queueLinkedList = new QueueLinkedList();

        queueLinkedList.enqueue(1);
        System.out.printf("enqueue(1)\t%s\n", queueLinkedList);
        queueLinkedList.enqueue(20);
        System.out.printf("enqueue(20)\t%s\n", queueLinkedList);
        var a = queueLinkedList.dequeue();
        System.out.printf("dequeue()\t%s\t->%s\n", queueLinkedList, a);
        queueLinkedList.enqueue(30);
        System.out.printf("enqueue(30)\t%s\n", queueLinkedList);

        System.out.printf("first()\t%s\t->%s\n", queueLinkedList, queueLinkedList.first());
    }
}

