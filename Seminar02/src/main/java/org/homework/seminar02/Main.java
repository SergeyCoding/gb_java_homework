package org.homework.seminar02;

import org.homework.seminar02.task01.SqlBuilderDispatcher;
import org.homework.seminar02.task02.BubbleSortingDispatcher;
import org.homework.seminar02.task03.JsonParserDispatcher;
import org.homework.seminar02.task04.SimpleCalcDispatcher;

import java.util.Scanner;

/**
 * Семинар 2.
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("Seminar02");
        System.out.println("1. Sql-builder ");
        System.out.println("2. Пузырьковая сортировка ");
        System.out.println("3. Json-парсер ");
        System.out.println("4. Калькулятор с логированием ");
        System.out.print("Выберите номер задачи: ");

        try (var ss = new Scanner(System.in)) {
            var s = ss.nextLine();

            switch (s) {
                case "1" -> SqlBuilderDispatcher.run();
                case "2" -> BubbleSortingDispatcher.run();
                case "3" -> JsonParserDispatcher.run();
                case "4" -> SimpleCalcDispatcher.run();
                default -> System.out.println("Задача не выбрана");
            }
        }
    }
}
