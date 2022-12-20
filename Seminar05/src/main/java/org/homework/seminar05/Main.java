package org.homework.seminar05;

import org.homework.tools.ConsoleHelper;

/**
 * 1. Реализуйте структуру телефонной книги с помощью HashMap, учитывая,
 * что 1 человек может иметь несколько телефонов.
 * <p>
 * 2. Пусть дан список сотрудников:
 * Написать программу, которая найдет и выведет повторяющиеся имена с количеством повторений.
 * Отсортировать по убыванию популярности.
 * <p>
 * Иван Иванов
 * Светлана Петрова
 * Кристина Белова
 * Анна Мусина
 * Анна Крутова
 * Иван Юрин
 * Петр Лыков
 * Павел Чернов
 * Петр Чернышов
 * Мария Федорова
 * Марина Светлова
 * Мария Савина
 * Мария Рыкова
 * Марина Лугова
 * Анна Владимирова
 * Иван Мечников
 * Петр Петин
 * Иван Ежов
 * <p>
 * 3. Реализовать алгоритм пирамидальной сортировки (HeapSort).
 * <p>
 * 4. На шахматной доске расставить 8 ферзей так, чтобы они не били друг друга.
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("Seminar04");
        System.out.println("1. Revert LinkedList");
        System.out.println("2. Очередь на LinkedList");
        System.out.println("3. Калькулятор с возможностью отмены");
        System.out.println("0. Выход");

        var numberTask = ConsoleHelper.getNaturalInteger("Выберите номер задачи: ", x -> x >= 0 && x <= 3);

        switch (numberTask) {
//            case 1 -> RevertLinkedListManager.run();
//            case 2 -> QueueLinkedListManager.run();
//            case 3 -> SimpleCalculatorManager.run();
            default -> System.out.println("Задача не выбрана");
        }
    }
}