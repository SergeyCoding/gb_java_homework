package org.homework.tools;

import java.util.Scanner;
import java.util.function.Predicate;

public class ConsoleHelper {

    private static final Scanner scannerIn = new Scanner(System.in);

    public static int getNaturalInteger(String prompt) {
        return getFromConsole(prompt, n -> n > 0);
    }

    public static int getNaturalInteger(String prompt, Predicate<Integer> fun) {
        return getFromConsole(prompt, fun);
    }

    public int getInteger(String prompt) {
        return getFromConsole(prompt, n -> n > 0);
    }

    public String getString(String prompt) {
        System.out.println(prompt);
        
        return scannerIn.nextLine();
    }

    private static int getFromConsole(String prompt, Predicate<Integer> fun) {
        int n;

        while (true) {
            System.out.print(prompt);
            try {
                n = Integer.parseInt(scannerIn.nextLine());

                if (fun.test(n)) {
                    break;
                }
            } catch (NumberFormatException ignored) {
            }
            System.out.print("Ошибка! ");
        }

        return n;
    }
}
