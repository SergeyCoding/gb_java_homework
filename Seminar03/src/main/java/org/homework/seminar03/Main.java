package org.homework.seminar03;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Seminar03");
        System.out.println("1. Быстрая сортировка ");
        System.out.println("2. Удалить четные ");
        System.out.println("3. Массив  ");
        System.out.print("Выберите номер задачи: ");

        try (var ss = new Scanner(System.in)) {
            var s = ss.nextLine();

            switch (s) {
//                case "1" -> SqlBuilderDispatcher.run();
//                case "2" -> BubbleSortingDispatcher.run();
//                case "3" -> JsonParser.run();
                default -> System.out.println("Задача не выбрана");
            }
        }
    }
}