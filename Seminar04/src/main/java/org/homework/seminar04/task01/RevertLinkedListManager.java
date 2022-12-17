package org.homework.seminar04.task01;

import org.homework.tools.ConsoleHelper;
import org.homework.tools.ListGenerator;

import java.util.Arrays;

/**
 * 1. Пусть дан LinkedList с несколькими элементами. Реализуйте метод, который вернет “перевернутый” список.
 */
public class RevertLinkedListManager {
    public static void run() {
        System.out.println("\nСеминар 4.");
        System.out.println("Задача 1.");

        int n = ConsoleHelper.getNaturalInteger("Введите размер массива: ");


        var linkedList = ListGenerator.generateLinkedList(n);
        System.out.println(Arrays.toString(linkedList.toArray()));

        var revertLinkedList = new RevertLinkedList(linkedList);
        System.out.println(Arrays.toString(revertLinkedList.revert().toArray()));
    }
}
