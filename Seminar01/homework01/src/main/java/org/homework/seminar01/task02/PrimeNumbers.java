package org.homework.seminar01.task02;

/**
 * Вывести все простые числа от 1 до 1000
 */
public class PrimeNumbers {
    public static void run() {
        System.out.println("\nTask02");

        var pn = new PrimeNumbers().get(1000);

        for (var n : pn) {
            if (n > 0)
                System.out.print(n + " ");
        }
    }

    public int[] get(int num) {
        int[] arr = new int[num];
        int count = 1;
        arr[0] = 1;

        for (int i = 2; i < num + 1; i++) {
            if (isSimple(i, arr, count))
                arr[count++] = i;
        }

        return arr;
    }

    private boolean isSimple(int k, int[] result, int count) {
        for (int i = 1; i < count; i++) {
            if (k % result[i] == 0)
                return false;
        }

        return true;
    }
}
