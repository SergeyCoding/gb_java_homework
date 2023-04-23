package org.gb.exceptions;

import java.util.Scanner;

/**
 * Разработайте программу, которая выбросит Exception, когда пользователь вводит пустую строку.
 * Пользователю должно показаться сообщение, что пустые строки вводить нельзя.
 */
public class Task04 {
    private final Scanner scanner;

    public Task04(Scanner scanner) {

        this.scanner = scanner;
    }

    public void execute() {
        System.out.println("\nTask04");
        System.out.println("\nВведите \"exit\" для выхода");

        String s = "";

        while (true) {
            try {
                s = getFromConsole("> ");

                if (s.equals("exit"))
                    break;

                System.out.println(s);
            } catch (final StringIndexOutOfBoundsException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    private String getFromConsole(String prompt) {
        System.out.print(prompt);
        var str = scanner.nextLine();

        if (str == null || str.trim().length() == 0)
            throw new StringIndexOutOfBoundsException("Ошибка. Пустая строка");

        return str;
    }
}


