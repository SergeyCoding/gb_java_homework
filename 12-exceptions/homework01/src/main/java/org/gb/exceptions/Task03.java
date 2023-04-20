package org.gb.exceptions;

import java.util.Arrays;

/**
 * Реализуйте метод, принимающий в качестве аргументов два целочисленных массива,
 * и возвращающий новый массив, каждый элемент которого равен частному элементов
 * двух входящих массивов в той же ячейке. Если длины массивов не равны, необходимо
 * как-то оповестить пользователя. Важно: При выполнении метода единственное исключение,
 * которое пользователь может увидеть - RuntimeException, т.е. ваше.
 */
public class Task03 {

    public void execute() {
        executeEx(new int[]{10, 30, 50, 60}, new int[]{1, 2, 3, 4});

        try {
            executeEx(new int[]{10, 30, 50, 60}, new int[]{1, 2, 3, 0});
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            executeEx(new int[]{10, 30, 50, 60}, new int[]{1, 2, 3, 4, 55});
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void executeEx(int[] x, int[] y) {
        try {
            var a = x;
            var b = y;

            var result = divide(a, b);
            System.out.println(Arrays.toString(result));
        } catch (IllegalArgumentException e) {
            throw new RuntimeException(e.getMessage());
        } catch (ArithmeticException e) {
            throw new RuntimeException("Произошла арифметическая ошибка");
        } catch (Exception e) {
            throw new RuntimeException("Произошла непридвиденная ошибка");
        }
    }

    public int[] divide(int[] a, int[] b) {

        if (a.length != b.length) {
            throw new IllegalArgumentException("Ошибка. Длины массивов имеют разную длину.");
        }

        var result = new int[a.length];

        for (int i = 0; i < a.length; i++) {
            result[i] = a[i] / b[i];
        }

        return result;

    }
}
