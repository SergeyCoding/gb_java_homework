package org.homework.seminar03;


import org.homework.seminar03.task01.MergeSortManager;
import org.homework.seminar03.task02.RemoveEvenManager;
import org.homework.seminar03.task03.ArrayStatisticsManager;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Seminar03");
        System.out.println("1. Cортировка слиянием");
        System.out.println("2. Удалить четные ");
        System.out.println("3. Массив  ");
        System.out.print("Выберите номер задачи: ");

        try (var ss = new Scanner(System.in)) {
            var s = ss.nextLine();

            switch (s) {
                case "1" -> MergeSortManager.run();
                case "2" -> RemoveEvenManager.run();
                case "3" -> ArrayStatisticsManager.run();
                default -> System.out.println("Задача не выбрана");
            }
        }
    }
}