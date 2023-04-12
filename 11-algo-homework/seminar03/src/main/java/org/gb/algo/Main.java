package org.gb.algo;

public class Main {
    public static void main(String[] args) {
        System.out.println("Алгоритмы и структуры данных");
        System.out.println("Seminar03");

        System.out.println("\nTask01");
        task01();
        System.out.println("\nTask02");
        task02();
        System.out.println("\nTask03");
        task03();

        System.out.println("\n#");
    }

    private static void task01() {
        var sl = new SinglyLinkedList();

        sl.addToTail(1);
        sl.addToTail(2);
        sl.addToTail(33);
        sl.addToTail(400);
        sl.addToTail(555);

        System.out.println(sl);
        sl.reverse();
        System.out.println(sl);

        var sl2 = new SinglyLinkedList();

        //sl2.addToTail(1);


        System.out.println(sl2);
        sl2.reverse();
        System.out.println(sl2);
    }

    private static void task02() {
        var sl = new SinglyLinkedList();

        sl.addToTail(1);
        sl.addToTail(-2);
        sl.addToTail(33);
        sl.addToTail(0);
        sl.addToTail(-400);
        sl.addToTail(555);

        var sl1 = new SinglyLinkedList();
        var sl2 = new SinglyLinkedList();

        System.out.println(sl);
        divideByZero(sl, sl1, sl2);
        System.out.println(sl1);
        System.out.println(sl2);
    }

    private static void task03() {
        var sl = new SinglyLinkedList();

        sl.addToTail(1);
        sl.addToTail(2);
        sl.addToTail(33);
        sl.addToTail(400);
        sl.addToTail(555);
        sl.addToTail(7);
        sl.addToTail(4);
        sl.addToTail(4);
        sl.addToTail(2);
        sl.addToTail(555);

        System.out.println(sl);
        doubleEven(sl);
        System.out.println(sl);
    }


    /**
     * ** Задача 3.
     * Написать функцию, которая по списку L строит два новых
     * списка: L1 – из положительных элементов и L2 – из отрицательных элементов списка L.
     */
    public static void divideByZero(SinglyLinkedList l, SinglyLinkedList l1, SinglyLinkedList l2) {
        var cur = l.head;

        while (cur != null) {
            if (cur.value > 0) {
                l1.addToTail(cur.value);
            }
            if (cur.value < 0) {
                l2.addToTail(cur.value);
            }
            cur = cur.next;
        }
    }

    /**
     * * Задача2.
     * Имеется список целых чисел. Продублировать в нем все четные числа
     */
    public static void doubleEven(SinglyLinkedList list) {
        var cur = list.head;

        while (cur != null) {
            if (cur.value % 2 == 0) {
                cur.next = new Node(cur.value, cur.next);
                cur = cur.next.next;
                continue;
            }

            cur = cur.next;
        }

        if (list.tail.next != null)
            list.tail = list.tail.next;
    }
}
