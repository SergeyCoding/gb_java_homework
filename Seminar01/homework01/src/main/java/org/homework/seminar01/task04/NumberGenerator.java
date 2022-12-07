package org.homework.seminar01.task04;

import java.util.Iterator;

public class NumberGenerator implements Iterable<Integer>, Iterator<Integer> {
    private final char[] numberMaskArray;
    private final String numberMask;
    private boolean initialized = false;
    private int maxNumber;
    private int current;


    public NumberGenerator(String numberMask) {

        this.numberMaskArray = numberMask.toCharArray();
        this.numberMask = numberMask;
    }

    void init() {
        initialized = true;

        var cnt = 0;
        for (var c : numberMaskArray) {
            if (c == '?')
                cnt++;
        }

        current = 0;
        maxNumber = (int) Math.pow(10, cnt);
    }


    @Override
    public Iterator<Integer> iterator() {

        return new NumberGenerator(numberMask);
    }

    @Override
    public boolean hasNext() {
        if (!initialized)
            init();

        return current < maxNumber;

    }

    @Override
    public Integer next() {
        if (!initialized)
            init();

        var current_str = "00000000000000000000000" + current;
        var current_cnt = current_str.length();

        var sb = new StringBuilder();

        for (char c : numberMaskArray) {
            if (c == '?')
                sb.append(current_str.charAt(--current_cnt));
            else
                sb.append(c);
        }

        current++;
        return Integer.parseInt(sb.toString());
    }
}
