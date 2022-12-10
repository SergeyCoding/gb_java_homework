package org.homework.seminar02.task02;

import java.util.Arrays;
import java.util.Scanner;

public class BubbleSortingDispatcher {
    public static void run() {
        System.out.println("\nСеминар 2.");
        System.out.println("Задача 2.");

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

        var arr = generateArray(n, 100);
        System.out.println(Arrays.toString(arr));

        var bs = new BubbleSorting(arr, "log.txt");
        System.out.println(Arrays.toString(bs.sort()));

        System.out.println("Процесс сортировки в лог-файле log.txt");
    }

    private static int[] generateArray(int n, int maxNum) {
        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = 1 + (int) Math.round(Math.random() * maxNum);
        }

        return arr;
    }
}
