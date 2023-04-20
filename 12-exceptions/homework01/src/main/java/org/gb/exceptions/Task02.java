package org.gb.exceptions;

import java.util.Arrays;

/**
 * Реализуйте метод, принимающий в качестве аргументов два целочисленных массива,
 * и возвращающий новый массив, каждый элемент которого равен разности элементов двух
 * входящих массивов в той же ячейке. Если длины массивов не равны, необходимо
 * как-то оповестить пользователя.
 */
public class Task02 {

    public void execute() {

        var a = new int[]{1, 3, 5, 6};
        var b = new int[]{0, 2, 4, 5};

        var result = subtract(a, b);

        if (result.errorCode == 0) {
            System.out.println(Arrays.toString(result.result));
        } else {
            System.out.println(result.errorString);
        }

        var a2 = new int[]{1, 3, 5, 6};
        var b2 = new int[]{0, 2, 4, 5, 5};

        result = subtract(a2, b2);

        if (result.errorCode == 0) {
            System.out.println(Arrays.toString(result.result));
        } else {
            System.out.println(result.errorString);
        }


    }

    public SubtractResult subtract(int[] a, int[] b) {

        var result = new SubtractResult();

        if (a.length != b.length) {
            result.errorCode = -1;
            result.errorString = "Ошибка. Длины массивов имеют разную длину.";
            return result;
        }

        result.result = new int[a.length];

        for (int i = 0; i < a.length; i++) {
            result.result[i] = a[i] - b[i];
        }

        return result;

    }

    class SubtractResult {
        int errorCode = 0;
        String errorString = null;
        int[] result;
    }
}
