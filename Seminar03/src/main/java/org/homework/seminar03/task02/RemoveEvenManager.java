package org.homework.seminar03.task02;

import org.homework.tools.ListGenerator;

import java.util.Arrays;
import java.util.Scanner;

public class RemoveEvenManager {
    public static void run() {
        System.out.println("\nСеминар 3.");
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

        var arr = ListGenerator.generateList(n);
        System.out.println(Arrays.toString(arr.toArray()));

        var removeEven = new RemoveEven(arr);
        System.out.println(Arrays.toString(removeEven.execute().toArray()));
    }
}
