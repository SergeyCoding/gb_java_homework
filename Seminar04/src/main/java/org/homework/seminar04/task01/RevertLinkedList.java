package org.homework.seminar04.task01;

import java.util.LinkedList;

/**
 * 1. Пусть дан LinkedList с несколькими элементами. Реализуйте метод, который вернет “перевернутый” список.
 */
public class RevertLinkedList {
    private final LinkedList<Integer> linkedList;
    private boolean isReverted = false;

    public RevertLinkedList(LinkedList<Integer> linkedList) {
        this.linkedList = linkedList;
    }

    public LinkedList<Integer> revert() {
        if (isReverted)
            return linkedList;

        for (int i = 0; i < linkedList.size() / 2; i++) {
            int indexEnd = linkedList.size() - 1 - i;
            var tmp = linkedList.get(indexEnd);
            linkedList.set(indexEnd, linkedList.get(i));
            linkedList.set(i, tmp);
        }

        isReverted = true;

        return linkedList;
    }
}
