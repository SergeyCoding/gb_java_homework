package org.homework.seminar02.task02;

import java.io.IOException;
import java.util.Arrays;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

/**
 * Реализуйте алгоритм сортировки пузырьком числового массива, результат после каждой итерации запишите в лог-файл.
 */
public class BubbleSorting {

    private Logger logger = Logger.getLogger(BubbleSorting.class.getName());
    private final int[] arr;
    private final String logFilename;
    private boolean initialized = false;


    public BubbleSorting(int[] arr, String logFilename) {
        this.arr = arr;
        this.logFilename = logFilename;
    }

    void init() {
        if (initialized)
            return;

        try {
            FileHandler fh = new FileHandler(logFilename);
            fh.setFormatter(new SimpleFormatter());
            logger.addHandler(fh);
            logger.setUseParentHandlers(false);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }


    public int[] sort() {
        init();

        logger.info("start");
        boolean isChange;
        do {
            isChange = false;

            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i] > arr[i + 1]) {
                    var t = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = t;
                    isChange = true;
                }
            }
            logger.info(Arrays.toString(arr));
        } while (isChange);

        return arr;
    }


}
