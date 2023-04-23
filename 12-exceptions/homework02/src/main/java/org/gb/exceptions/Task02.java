package org.gb.exceptions;

/**
 * Если необходимо, исправьте данный код (задание 2)
 */
public class Task02 {

    public void execute() {
        System.out.println("\nTask02");

        new Task02().exampleMethod(new int[]{1, 22, -333, 0, 5555, 6, 7, 8, 9});
        new Task02().exampleMethod(new int[]{1, 22, -333, 0, 5555});
    }

    //    try {
    //        int d = 0;
    //        double catchedRes1 = intArray[8] / d;
    //        System.out.println("catchedRes1 = " + catchedRes1);
    //    } catch (ArithmeticException e) {
    //        System.out.println("Catching exception: " + e);
    //    }

    private void exampleMethod(int[] intArray) {
        try {
            int d = 0;
            double catchedRes1 = intArray[8] / d;
            System.out.println("catchedRes1 = " + catchedRes1);
        } catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
            System.out.println("Catching exception: " + e);
        }
    }
}
