package org.homework.seminar01.task03;

import java.util.Scanner;


/**
 * Реализовать простой калькулятор
 */
public class SimpleCalc {
    public static void Run() {
        var sc = new Scanner(System.in);

        System.out.println("Вводите сначала два числа, потом операцию (+, -, *, /)");
        System.out.print("Первое число:");
        double num1 = Double.parseDouble(sc.nextLine());

        System.out.print("Второе число:");
        double num2 = Double.parseDouble(sc.nextLine());

        System.out.print("Операция:");
        char op = sc.nextLine().charAt(0);

        var res = operation(num1, num2, op);
        if (Double.isNaN(res)) {
            System.out.println("Ошибка!!!");
            return;
        }

        System.out.printf("%f %c %f = %f", num1, op, num2, res);
    }

    static double operation(double n1, double n2, char op) {
        switch (op) {
            case '+':
                return n1 + n2;
            case '-':
                return n1 - n2;
            case '*':
                return n1 * n2;
            case '/':
                return n1 / n2;
        }
        return Double.NaN;
    }
}
