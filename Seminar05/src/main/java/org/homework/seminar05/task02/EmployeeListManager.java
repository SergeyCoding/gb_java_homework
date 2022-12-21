package org.homework.seminar05.task02;

import org.homework.tools.ConsoleHelper;
import org.homework.tools.ListGenerator;

import java.util.Arrays;

/**
 * 2. Пусть дан список сотрудников:
 * Написать программу, которая найдет и выведет повторяющиеся имена с количеством повторений.
 * Отсортировать по убыванию популярности.
 */
public class EmployeeListManager {
    public static void run() {
        System.out.println("\nСеминар 5");
        System.out.println("Задача 2");

        int n = ConsoleHelper.getNaturalInteger("Введите размер массива: ");


        var linkedList = ListGenerator.generateLinkedList(n);
        System.out.println(Arrays.toString(linkedList.toArray()));

//        var revertLinkedList = new RevertLinkedList(linkedList);
//        System.out.println(Arrays.toString(revertLinkedList.revert().toArray()));
    }
}
