package org.gb.exceptions;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.LinkedList;

/**
 * Реализуйте 3 метода, чтобы в каждом из них получить разные исключения
 * Посмотрите на код, и подумайте сколько разных типов исключений вы тут сможете получить?
 */
public class Task01 {

    public void execute() {

        try {
            method1(3, 0);
        } catch (Exception e) {
            System.out.println(e.getClass().getTypeName());
        }

        try {
            method2();
        } catch (Exception e) {

            System.out.println(e.getClass().getTypeName());

        }

        try {
            method3();
        } catch (Exception e) {
            System.out.println(e.getClass().getTypeName());
        }

    }


    public int method1(int a, int b) {
        var result = a / b;
        return result;
    }

    public void method2() throws IOException {
        var f = Files.readAllBytes(Path.of("cdf:aaa"));
    }

    public void method3() {
        LinkedList<Integer> a = null;
        a.add(5);
    }
}
