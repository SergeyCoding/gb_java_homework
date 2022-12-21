package org.homework.seminar05;

import org.homework.seminar05.task01.PhonebookManager;
import org.homework.seminar05.task02.EmployeeListManager;
import org.homework.seminar05.task03.HeapSortManager;
import org.homework.seminar05.task04.EightQueenManager;
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
        System.out.println("1. Телефонная книга");
        System.out.println("2. Сотрудники");
        System.out.println("3. Пирамидальная сортировка");
        System.out.println("4. 8 ферзей");
        System.out.println("0. Выход");

        var numberTask = ConsoleHelper.getNaturalInteger("Выберите номер задачи: ", x -> x >= 0 && x <= 4);

        switch (numberTask) {
            case 1 -> PhonebookManager.run();
            case 2 -> EmployeeListManager.run();
            case 3 -> HeapSortManager.run();
            case 4 -> EightQueenManager.run();
            default -> System.out.println("Задача не выбрана");
        }
    }
}