package org.homework.tools;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ListGenerator {

    public static final int MinRandomNumber = 0;
    public static final int MaxRandomNumber = 100;

    public static List<Integer> generateList(int length) {
        List<Integer> arr = new ArrayList<Integer>();
        Random rnd = new Random();

        for (int i = 0; i < length; i++) {
            arr.add(rnd.nextInt(MinRandomNumber, MaxRandomNumber));
        }

        return arr;
    }
}
