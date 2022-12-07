package org.homework.seminar01.task04;

import java.util.Iterator;

public class NumberGenerator implements Iterable<Integer>, Iterator<Integer> {
    private final char[] numberMask;
    private boolean initialized = false;
    private int maxNumber;
    private int current;


    public NumberGenerator(String numberMask) {
        this.numberMask = numberMask.toCharArray();
    }

    void Init() {
        initialized = true;

        var cnt = 0;
        for (var c : numberMask) {
            if (c == '?')
                cnt++;
        }

        current = 0;
        maxNumber = (int) Math.pow(10, cnt) - 1;
    }


    @Override
    public Iterator<Integer> iterator() {
        return this;
    }

    @Override
    public boolean hasNext() {
        return current < maxNumber;
    }

    @Override
    public Integer next() {
        if (!initialized)
            Init();

        var result = 0;

        var current_str = "00000000000000000000000" + current;
        var current_cnt = current_str.length();

        var sb = new StringBuilder();

        for (char c : numberMask) {
            if (c == '?')
                sb.append(current_str.indexOf(--current_cnt));
        }

        current++;
        return Integer.parseInt(sb.toString());
    }
}
