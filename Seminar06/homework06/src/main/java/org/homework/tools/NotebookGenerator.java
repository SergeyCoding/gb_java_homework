package org.homework.tools;

import java.util.Random;

public class NotebookGenerator {

    private static final Random rnd = new Random();

    public static int getRam() {
        var n = rnd.nextInt(2, 7);
        return 1 << n;
    }

    public static int getHdd() {
        var n = rnd.nextInt(6, 13);
        return 1 << n;
    }

    public static String getOs(String name) {
        if (name.equals("Apple MacBook")) {
            return "macOS";
        }

        if (name.equals("Microsoft Surface")) {
            return "Windows 11";
        }

        if (name.equals("Google")) {
            return "Chrome OS";
        }

        String[] os = {"Windows 10", "Windows 11", "Windows 8", "Chrome OS", "Ubuntu"};
        var n = rnd.nextInt(5);
        return os[n];
    }

    public static String getName() {
        String[] os = {"Apple MacBook", "Lenovo", "Microsoft Surface", "Acer", "HP", "Dell", "Google"};
        var n = rnd.nextInt(7);
        return os[n];
    }

    public static String getLetter() {
        String[] l = {"A", "M", "X", "S"};
        var n = rnd.nextInt(4);
        var m = rnd.nextInt(1, 10);
        return l[n] + m;
    }

    public static String getColor() {
        String[] color = {"black", "white", "gray"};
        var n = rnd.nextInt(3);
        return color[n];
    }
}
