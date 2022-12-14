package org.homework.seminar03.task03;

import org.homework.tools.ListGenerator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayStatisticsManager {
    public static void run() {
        System.out.println("\nСеминар 3.");
        System.out.println("Задача 3.");

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

        var arr = new ArrayList<>(ListGenerator.generateList(n));
        System.out.println(Arrays.toString(arr.toArray()));

        var as = new ArrayStatistics(arr);
        System.out.printf("min = %d\n", as.getMinValue());
        System.out.printf("max = %d\n", as.getMaxValue());
        System.out.printf("avg = %g\n", as.getAvg());
    }
}
