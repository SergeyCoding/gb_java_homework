package org.homework.seminar06;

/**
 * 1 - ОЗУ
 * 2 - Объем ЖД
 * 3 - Операционная система
 * 4 - Цвет …
 */
public class Notebook {
    private final String name;

    public Notebook(String name, String ram, String hd, String os, String color) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
