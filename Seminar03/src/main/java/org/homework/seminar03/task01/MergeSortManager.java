package org.homework.seminar03.task01;

import java.util.*;

/**
 * Реализовать алгоритм сортировки слиянием
 */
public class MergeSortManager {

    public static final int MaxRandomNumber = 100;

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

        var arr = generateList(n);
        System.out.println(Arrays.toString(arr.toArray()));

        var ms = new MergeSort(arr);
        System.out.println(Arrays.toString(ms.sort().toArray()));
    }

    private static List<Integer> generateList(int n) {
        List<Integer> arr = new ArrayList<Integer>();
        Random rnd = new Random();

        for (int i = 0; i < n; i++) {
            arr.add(rnd.nextInt(1, MaxRandomNumber));
        }

        return arr;
    }
}
