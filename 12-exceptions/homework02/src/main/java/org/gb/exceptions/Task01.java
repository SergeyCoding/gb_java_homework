package org.gb.exceptions;

import java.util.Scanner;

/**
 * Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float), и возвращает введенное значение.
 * Ввод текста вместо числа не должно приводить к падению приложения, вместо этого,
 * необходимо повторно запросить у пользователя ввод данных.
 */
public class Task01 {

    private final Scanner scanner;

    public Task01(Scanner scanner) {

        this.scanner = scanner;
    }

    public void execute() {
        System.out.println("\nTask01");

        var d = getFloatFromConsole("Введите число: ");
        System.out.printf("Результат: %f\n", d);
    }

    private float getFloatFromConsole(String prompt) {
        System.out.print(prompt);

        float result = 0;

        while (true) {
            try {
                var str = this.scanner.nextLine();
                result = Float.parseFloat(str);
                break;
            } catch (NumberFormatException ignored) {

            }
            System.out.print("Ошибка! " + prompt);
        }

        return result;
    }
}
