package org.homework.seminar02.task02;

import java.util.Scanner;

public class BubbleSortingDispatcher {
    public static void run() {

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

        
    }
}
