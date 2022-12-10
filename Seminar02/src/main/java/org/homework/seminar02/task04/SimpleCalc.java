package org.homework.seminar02.task04;

import org.homework.seminar02.task02.BubbleSorting;

import java.io.IOException;
import java.util.Scanner;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

/**
 * К калькулятору из предыдущего дз добавить логирование.
 */

public class SimpleCalc {
    public static void run() {
        System.out.println("\nСеминар 2.");
        System.out.println("Задача 4.");

        var logFilename = "calc_log.txt";
        var logger = Logger.getLogger(BubbleSorting.class.getName());
        try {
            FileHandler fh = new FileHandler(logFilename);
            fh.setFormatter(new SimpleFormatter());
            logger.addHandler(fh);
            logger.setUseParentHandlers(false);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        try (var sc = new Scanner(System.in)) {
            System.out.println("Вводите сначала два числа, потом операцию (+, -, *, /)");
            System.out.print("Первое число:");
            double num1 = Double.parseDouble(sc.nextLine());
            logger.info("Первое число: " + num1);

            System.out.print("Второе число:");
            double num2 = Double.parseDouble(sc.nextLine());
            logger.info("Второе число: " + num2);

            System.out.print("Операция:");
            char op = sc.nextLine().charAt(0);
            logger.info("Операция: " + op);


            var res = operation(num1, num2, op);
            if (Double.isNaN(res)) {
                System.out.println("Ошибка!!!");
                logger.severe("Ошибка!!!");
                return;
            }

            String result = String.format("%f %c %f = %f", num1, op, num2, res);
            System.out.println(result);
            logger.info(result);

            System.out.println("Все действия сохранены в лог-файле calc_log.txt");
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
    }

    static double operation(double n1, double n2, char op) {
        return switch (op) {
            case '+' -> n1 + n2;
            case '-' -> n1 - n2;
            case '*' -> n1 * n2;
            case '/' -> n1 / n2;
            default -> Double.NaN;
        };
    }
}
