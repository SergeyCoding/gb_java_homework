package org.homework.seminar03.task03;

import java.util.ArrayList;

/**
 * Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее из этого списка.
 */
public class ArrayStatistics {
    private final ArrayList<Integer> arrayList;

    public ArrayStatistics(ArrayList<Integer> arrayList) {
        this.arrayList = arrayList;
    }

    public int getMinValue() {
        var result = Integer.MAX_VALUE;

        for (var x : arrayList) {
            if (x < result) {
                result = x;
            }
        }

        return result;
    }

    public int getMaxValue() {
        var result = Integer.MIN_VALUE;

        for (var x : arrayList) {
            if (x > result) {
                result = x;
            }
        }

        return result;
    }

    public double getAvg() {
        if (arrayList.size() == 0) {
            return Double.NaN;
        }

        var sum = 0;

        for (var x : arrayList) {
            sum = sum + x;
        }

        return (double) sum / arrayList.size();
    }
}
