package org.gb.exceptions;

import org.gb.exceptions.task03.Task03;

import java.util.Scanner;

/**
 * Исключения в программировании и их обработка
 * Семинар 02
 */
public class Main {

    static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Исключения в программировании и их обработка");
        System.out.println("Семинар 02");

        var enableAll = true;


        if (false || enableAll) {
            new Task01(scanner).execute();
        }

        if (false || enableAll) {
            new Task02().execute();
        }

        if (true || enableAll) {
            new Task03().execute();
        }

        if (true || enableAll) {
            new Task04(scanner).execute();
        }
    }
}