package org.homework.seminar06;

/**
 * 1 - ОЗУ
 * 2 - Объем ЖД
 * 3 - Операционная система
 * 4 - Цвет …
 */
public class Notebook {
    private final String name;
    public int ram;
    public int hd;
    public String os;
    public String color;

    public Notebook(String name) {
        this.name = name;

    }

    @Override
    public String toString() {
        return String.format("%s %s (ram: %d Gb, hdd: %d Gb, os: %s)", name, color, ram, hd, os);
    }
}
