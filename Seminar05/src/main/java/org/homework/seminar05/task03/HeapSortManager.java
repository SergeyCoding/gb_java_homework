package org.homework.seminar05.task03;

import org.homework.tools.ConsoleHelper;
import org.homework.tools.ListGenerator;

import java.util.Arrays;

public class HeapSortManager {
    public static void run() {
        System.out.println("\nСеминар 5");
        System.out.println("Задача 3");

        int n = ConsoleHelper.getNaturalInteger("Введите размер массива: ");


        var list = ListGenerator.generateList(n);
        System.out.println(Arrays.toString(list.toArray()));

        var heapSort = new HeapSort(list);
        System.out.println(Arrays.toString(heapSort.sort().toArray()));
    }
}

