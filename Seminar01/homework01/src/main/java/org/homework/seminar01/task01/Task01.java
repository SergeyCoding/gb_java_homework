package org.homework.seminar01.task01;

import java.util.Scanner;

/**
 * Вычислить n-ое треугольного число(сумма чисел от 1 до n), n! (произведение чисел от 1 до n)
 */
public class Task01 {
    public static void run() {

        System.out.println("\nTask01");

        System.out.print("Номер: ");
        var numStr = new Scanner(System.in).nextLine();

        int num = Integer.parseInt(numStr);

        if (num < 0) {
            System.out.println("Введите корректные данные");
            return;
        }

        int sum = 0;
        int factorial = 1;
        for (int i = 1; i <= num; i++) {
            sum += i;
            factorial *= i;
        }

        System.out.println("Треугольное число: " + sum);
        System.out.println("Факториал: " + factorial);
    }
}
