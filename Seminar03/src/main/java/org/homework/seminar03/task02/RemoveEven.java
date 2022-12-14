package org.homework.seminar03.task02;

import java.util.List;

/**
 * Пусть дан произвольный список целых чисел, удалить из него четные числа
 */
public class RemoveEven {

    private final List<Integer> list;

    public RemoveEven(List<Integer> list) {

        this.list = list;
    }

    public List<Integer> execute() {
        for (int i = list.size() - 1; i >= 0; i--) {
            if (list.get(i) % 2 == 0) {
                list.remove(i);
            }

        }
        return list;
    }
}
