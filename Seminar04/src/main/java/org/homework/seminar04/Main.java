package org.homework.seminar04;

import org.homework.seminar04.task01.RevertLinkedListManager;
import org.homework.seminar04.task02.QueueLinkedListManager;
import org.homework.seminar04.task03.CalculatorManager;
import org.homework.tools.ConsoleHelper;

/**
 * 1. Пусть дан LinkedList с несколькими элементами. Реализуйте метод, который вернет “перевернутый” список.
 * <p>
 * 2. Реализуйте очередь с помощью LinkedList со следующими методами:enqueue() - помещает
 * элемент в конец очереди, dequeue() - возвращает первый элемент из очереди и удаляет его,
 * first() - возвращает первый элемент из очереди, не удаляя.
 * <p>
 * 3. В калькулятор добавьте возможность отменить последнюю операцию.
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("Seminar03");
        System.out.println("1. Revert LinkedList");
        System.out.println("2. Очередь на LinkedList");
        System.out.println("3. Калькулятор с возможностью отмены");
        System.out.println("0. Выход");

        var numberTask = ConsoleHelper.getNaturalInteger("Выберите номер задачи: ", x -> x >= 0 && x <= 3);

        switch (numberTask) {
            case 1 -> RevertLinkedListManager.run();
            case 2 -> QueueLinkedListManager.run();
            case 3 -> CalculatorManager.run();
            default -> System.out.println("Задача не выбрана");
        }
    }
}