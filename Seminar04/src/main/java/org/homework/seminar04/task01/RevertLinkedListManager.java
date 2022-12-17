package org.homework.seminar04.task01;

import org.homework.tools.ConsoleHelper;
import org.homework.tools.ListGenerator;

import java.util.Arrays;

/**
 * 1. Пусть дан LinkedList с несколькими элементами. Реализуйте метод, который вернет “перевернутый” список.
 */
public class RevertLinkedListManager {
    public static void run() {
        System.out.println("\nСеминар 3.");
        System.out.println("Задача 1.");

        int n = ConsoleHelper.getNaturalInteger("Введите размер массива: ");


        var arr = ListGenerator.generateList(n);
        System.out.println(Arrays.toString(arr.toArray()));

//        var ms = new MergeSortNoRecursion(arr);
//        System.out.println(Arrays.toString(ms.sort().toArray()));
    }
}
