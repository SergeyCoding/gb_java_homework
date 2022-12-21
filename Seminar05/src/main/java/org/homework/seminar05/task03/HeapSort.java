package org.homework.seminar05.task03;

import org.homework.tools.ConsoleHelper;
import org.homework.tools.ListGenerator;

import java.util.Arrays;

public class HeapSort {
    public static void run() {
        System.out.println("\nСеминар 5");
        System.out.println("Задача 3");

        int n = ConsoleHelper.getNaturalInteger("Введите размер массива: ");


        var linkedList = ListGenerator.generateLinkedList(n);
        System.out.println(Arrays.toString(linkedList.toArray()));

//        var revertLinkedList = new RevertLinkedList(linkedList);
//        System.out.println(Arrays.toString(revertLinkedList.revert().toArray()));
    }
}
