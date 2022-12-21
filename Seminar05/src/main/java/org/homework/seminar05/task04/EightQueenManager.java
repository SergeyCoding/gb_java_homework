package org.homework.seminar05.task04;

import org.homework.tools.ConsoleHelper;

/**
 * 4. На шахматной доске расставить 8 ферзей так, чтобы они не били друг друга.
 */
public class EightQueenManager {

    public static void run() {
        System.out.println("\nСеминар 5");
        System.out.println("Задача 4");

        int n = ConsoleHelper.getNaturalInteger("Введите количество итераций (>1000): ");

        EightQueen eightQueen = new EightQueen();

        if (!eightQueen.Execute(n)) {
            System.out.println("Не удалось решить задачу за указанное количество итераций");
            return;
        }

        System.out.println("Задача решена!!!");
        System.out.println(eightQueen);

    }

}

