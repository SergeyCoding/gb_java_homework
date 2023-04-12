package org.homework.seminar06;

import java.util.Map;

/**
 * 1 - ОЗУ
 * 2 - Объем ЖД
 * 3 - Операционная система
 * 4 - Цвет …
 */
public class Notebook {
    public final String name;
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

    public boolean isPerfect(Map<String, Object> conditions) {
        for (var f : conditions.entrySet()) {
            if (f.getKey().equals("ОЗУmin") && ram < (int) f.getValue()) {
                return false;
            }
            if (f.getKey().equals("ОЗУmax") && ram > (int) f.getValue()) {
                return false;
            }
            if (f.getKey().equals("HDDmin") && hd < (int) f.getValue()) {
                return false;
            }
            if (f.getKey().equals("HDDmax") && hd > (int) f.getValue()) {
                return false;
            }
            if (f.getKey().equals("OS") && !os.equals(f.getValue())) {
                return false;
            }
            if (f.getKey().equals("color") && !color.equals(f.getValue())) {
                return false;
            }

        }
        return true;
    }
}
