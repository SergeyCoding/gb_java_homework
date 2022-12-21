package org.homework.seminar05.task01;

import org.homework.tools.ConsoleHelper;
import org.homework.tools.ListGenerator;

import java.util.Arrays;

/**
 * 1. Реализуйте структуру телефонной книги с помощью HashMap, учитывая,
 * что 1 человек может иметь несколько телефонов.
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
 */
public class PhonebookManager {
    public static void run() {
        System.out.println("\nСеминар 5");
        System.out.println("Задача 1");

        int n = ConsoleHelper.getNaturalInteger("Введите размер массива: ");


        var linkedList = ListGenerator.generateLinkedList(n);
        System.out.println(Arrays.toString(linkedList.toArray()));

//        var revertLinkedList = new RevertLinkedList(linkedList);
//        System.out.println(Arrays.toString(revertLinkedList.revert().toArray()));
    }
}
