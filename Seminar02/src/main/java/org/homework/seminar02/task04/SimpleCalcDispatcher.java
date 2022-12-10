package org.homework.seminar02.task04;

import java.util.Scanner;

public class SimpleCalcDispatcher {
    public static void run() {

        try (var sc = new Scanner(System.in)) {
            var n = 0;

            do {

                System.out.println("Размер массива: ");
                try {
                    n = Integer.parseInt(sc.nextLine());
                } catch (NumberFormatException e) {
                    System.out.println("Ошибка!!!");
                }

            } while (n > 0);


        }
    }
}
