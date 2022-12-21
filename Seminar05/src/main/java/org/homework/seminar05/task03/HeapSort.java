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

        var n = list.size();

        while (n > 1) {
            n = n - 1;
            swap(0, n);
            siftDown(0, n);
        }

        return list;
    }

    private void siftDown(int curRoot, int size) {
        int nMax = curRoot;
        var curRootValue = list.get(curRoot);

        while (true) {
            curRoot = nMax;

            var node1 = curRoot * 2 + 1;
            var node2 = node1 + 1;

            if ((node1 < size) && (list.get(node1) > curRootValue))
                nMax = node1;

            ++node1;
            if ((node1 < size) && (list.get(node1) > list.get(nMax))) {
                nMax = node1;
            }
            if (nMax == curRoot) break;

            list.set(curRoot, list.get(nMax));
            list.set(nMax, curRootValue);
        }
    }

    private void swap(int a, int b) {
        var tmp = list.get(a);
        list.set(a, list.get(b));
        list.set(b, tmp);
    }
}
