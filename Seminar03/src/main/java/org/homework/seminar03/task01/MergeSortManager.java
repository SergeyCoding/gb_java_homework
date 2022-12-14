package org.homework.seminar03.task01;

import org.homework.tools.ListGenerator;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Реализовать алгоритм сортировки слиянием
 */
public class MergeSortManager {


    public static void run() {
        System.out.println("\nСеминар 3.");
        System.out.println("Задача 1.");

        System.out.print("Введите размер массива: ");
        int n = 0;

        try (var sc = new Scanner(System.in)) {

            do {
                try {
                    n = Integer.parseInt(sc.nextLine());
                } catch (NumberFormatException e) {
                    System.out.print("Ошибка! >");
                }
            } while (n <= 0);
        }

        var arr = ListGenerator.generateList(n);
        System.out.println(Arrays.toString(arr.toArray()));

        var ms = new MergeSortNoRecursion(arr);
        System.out.println(Arrays.toString(ms.sort().toArray()));
    }

}
