package org.homework.seminar05.task03;

import java.util.ArrayList;
import java.util.List;

public class HeapSort {
    private final ArrayList<Integer> list;

    public HeapSort(List<Integer> list) {
        this.list = new ArrayList<>(list);
    }

    public List<Integer> sort() {
        for (int i = list.size() / 2 - 1; i >= 0; i--) {
            siftDown(i, list.size());
        }

        for (int i = list.size() - 1; i > 0; i--) {
            swap(0, i);
            siftDown(0, i);
        }

        return list;
    }

    private void siftDown(int curRoot, int size) {

        var curNode = curRoot;

        while (true) {

            var indexMaxValue = getIndexMaxValue(size, curNode, curNode * 2 + 1, curNode * 2 + 2);

            if (indexMaxValue == curNode) {
                break;
            }

            swap(curNode, indexMaxValue);
            curNode = indexMaxValue;
        }
    }

    private int getIndexMaxValue(int size, int curNode, int node1, int node2) {

        var vCur = list.get(curNode);
        var v1 = node1 < size ? list.get(node1) : Integer.MIN_VALUE;
        var v2 = node2 < size ? list.get(node2) : Integer.MIN_VALUE;

        if (vCur >= v1 && vCur >= v2) {
            return curNode;
        }

        if (v1 > v2)
            return node1;

        return node2;
    }

    private void swap(int a, int b) {
        var tmp = list.get(a);
        list.set(a, list.get(b));
        list.set(b, tmp);
    }
}
