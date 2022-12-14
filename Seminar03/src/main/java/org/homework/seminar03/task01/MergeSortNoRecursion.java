package org.homework.seminar03.task01;

import java.util.ArrayList;
import java.util.List;

/**
 * Реализовать алгоритм сортировки слиянием
 */
public class MergeSortNoRecursion {
    private final List<Integer> arr;

    public MergeSortNoRecursion(List<Integer> arr) {
        this.arr = new ArrayList<>(arr);
    }

    public List<Integer> sort() {

        var n = 1;

        while (n < arr.size()) {
            for (int i = 0; i <= arr.size(); i = i + n * 2) {
                merge(i, i + n, i + n, i + n + n);
            }

            n = n * 2;
        }

        return new ArrayList<>(arr);
    }

    private void merge(int leftFromIndex, int leftToIndex, int rightFromIndex, int rightToIndex) {
        leftToIndex = Math.min(leftToIndex, arr.size());
        rightFromIndex = Math.min(rightFromIndex, arr.size());
        rightToIndex = Math.min(rightToIndex, arr.size());

        var left = leftFromIndex;
        var right = rightFromIndex;

        var buffer = new ArrayList<Integer>();

        while (left < leftToIndex && right < rightToIndex) {
            if (arr.get(left) < arr.get(right)) {
                buffer.add(arr.get(left++));
            } else {
                buffer.add(arr.get(right++));
            }
        }

        buffer.addAll(arr.subList(left, leftToIndex));
        buffer.addAll(arr.subList(right, rightToIndex));

        var bc = 0;

        for (int i = leftFromIndex; i < leftToIndex; i++) {
            arr.set(i, buffer.get(bc++));
        }

        for (int i = rightFromIndex; i < rightToIndex; i++) {
            arr.set(i, buffer.get(bc++));
        }
    }
}
