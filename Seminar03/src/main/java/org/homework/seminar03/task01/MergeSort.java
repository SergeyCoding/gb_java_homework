package org.homework.seminar03.task01;

import java.util.ArrayList;
import java.util.List;

/**
 * Реализовать алгоритм сортировки слиянием
 */
public class MergeSort {
    private final List<Integer> arr;

    public MergeSort(List<Integer> arr) {
        this.arr = new ArrayList<>(arr);
    }

    public List<Integer> sort() {
        return sortRecursive(new ArrayList<>(arr));
    }

    public List<Integer> sortRecursive(List<Integer> curArray) {
        curArray = new ArrayList<>(curArray);

        if (curArray.size() < 2) {
            return curArray;
        }

        if (curArray.size() == 2) {
            if (curArray.get(0) > curArray.get(1)) {
                curArray.add(curArray.get(0));
                curArray.remove(0);
            }
            return curArray;
        }

        int middle = curArray.size() / 2;
        var left = curArray.subList(0, middle);
        var right = curArray.subList(middle, curArray.size());

        left = sortRecursive(left);
        right = sortRecursive(right);

        return merge(left, right);
    }

    private List<Integer> merge(List<Integer> left, List<Integer> right) {
        var result = new ArrayList<Integer>();
        while (!left.isEmpty() && !right.isEmpty()) {
            if (left.get(0) < right.get(0)) {
                result.add(left.get(0));
                left.remove(0);
            } else {
                result.add(right.get(0));
                right.remove(0);
            }
        }

        result.addAll(left);
        result.addAll(right);

        return result;
    }
}
