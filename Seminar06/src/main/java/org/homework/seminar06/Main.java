package org.homework.seminar06;

import org.homework.tools.ConsoleHelper;
import org.homework.tools.NotebookGenerator;

import java.util.*;

/**
 * 1. Подумать над структурой класса Ноутбук для магазина техники - выделить поля и методы. Реализовать в java.
 * <p>
 * 2. Создать множество ноутбуков.
 * <p>
 * 3. Написать метод, который будет запрашивать у пользователя критерий (или критерии) фильтрации и выведет ноутбуки,
 * отвечающие фильтру. Критерии фильтрации можно хранить в Map. Например:
 * “Введите цифру, соответствующую необходимому критерию:
 * <ul>
 *  <li>1 - ОЗУ</li>
 *  <li>2 - Объем ЖД</li>
 *  <li>3 - Операционная система</li>
 *  <li>4 - Цвет …</li>
 *      <ul>
 *          <li>1. Далее нужно запросить минимальные значения для указанных критериев - сохранить параметры фильтрации можно также в Map.</li>
 *          <li>2. Отфильтровать ноутбуки их первоначального множества и вывести проходящие по условиям.</li>
 *      </ul>
 * </ul>
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("Seminar06");
        System.out.println("Магазин техники\n");

        List<Notebook> notebooks = generateNotebooks(new Random().nextInt(15, 20));

        var fb = new FilterBuilder();

        System.out.println("Введите цифру, соответствующую необходимому критерию:");

        while (true) {
            System.out.println("1 - ОЗУ");
            System.out.println("2 - Объем ЖД");
            System.out.println("3 - Операционная система");
            System.out.println("4 - Цвет");
            System.out.println("0 - Продолжить");

            var answer = ConsoleHelper.getNaturalInteger("> ", x -> x >= 0 && x <= 4);

            if (answer == 0) {
                break;
            }

            if (answer == 1) {
                fb.chooseMinMax("Выберите ОЗУ от 4 Gb до 64 Gb", "ОЗУ", 4, 64);
                continue;
            }
            if (answer == 2) {
                fb.chooseMinMax("Выберите HDD от 256 Gb до 4096 Gb", "HDD", 256, 4096);
                continue;
            }

            System.out.println();
        }

        System.out.println("Текущий фильтр:");
        System.out.println(fb.getMap());

        System.out.println("Ноутбуки, удовлетворяющие выбранным критериям:");


        System.out.println("\nВыберите HDD от 256 Gb до 4096 Gb");
        var minHdd = ConsoleHelper.getNaturalInteger("HDD min:", x -> x >= 256 && x <= 4096, 256);
        var maxHdd = ConsoleHelper.getNaturalInteger("HDD max:", x -> x >= minHdd && x <= 4096, 4096);
        System.out.printf("HDD: %d Gb - %d Gb\n", minHdd, maxHdd);

        System.out.println("\nДоступные операционные системы:");
        List<String> osAll = new ArrayList<>(getAvailableOs(notebooks));
        for (int i = 0; i < osAll.size(); i++) {
            System.out.printf("%d - %s\n", i, osAll.get(i));
        }
        System.out.printf("%d - %s\n", osAll.size(), "любая");
        var os = ConsoleHelper.getNaturalInteger("OS:", x -> x >= 0 && x <= osAll.size(), osAll.size());
        if (os < osAll.size()) {
            System.out.printf("OS: %s\n", osAll.get(os));
        } else {
            System.out.printf("OS: %s\n", "любая");
        }

        System.out.println("\nДоступные цвета:");
        List<String> colorAll = new ArrayList<>(getAvailableColors(notebooks));
        for (int i = 0; i < colorAll.size(); i++) {
            System.out.printf("%d - %s\n", i, colorAll.get(i));
        }
        System.out.printf("%d - %s\n", colorAll.size(), "любой");
        var color = ConsoleHelper.getNaturalInteger("color:", x -> x >= 0 && x <= colorAll.size(), colorAll.size());
        if (color < colorAll.size()) {
            System.out.printf("color: %s\n", colorAll.get(color));
        } else {
            System.out.printf("color: %s\n", "любой");
        }
    }

    private static void chooseRam(Map<String, Integer> filterNotebook) {
        System.out.println("Выберите ОЗУ от 4 Gb до 64 Gb");
        var minRam = ConsoleHelper.getNaturalInteger("ОЗУ min:", x -> x >= 4 && x <= 64, 4);
        var maxRam = ConsoleHelper.getNaturalInteger("ОЗУ max:", x -> x >= minRam && x <= 64, 64);
        System.out.printf("ОЗУ: %d Gb - %d Gb\n", minRam, maxRam);
        filterNotebook.put("ОЗУ min:", minRam);
        filterNotebook.put("ОЗУ max:", maxRam);
    }

    private static Set<String> getAvailableColors(List<Notebook> notebooks) {
        Set<String> osAll = new HashSet<>();
        for (var nb : notebooks) {
            osAll.add(nb.color);
        }
        return osAll;
    }

    private static Set<String> getAvailableOs(List<Notebook> notebooks) {
        Set<String> osAll = new HashSet<>();
        for (var nb : notebooks) {
            osAll.add(nb.os);
        }
        return osAll;
    }

    private static List<Notebook> generateNotebooks(int count) {
        List<Notebook> nbList = new LinkedList<>();

        for (int i = 0; i < count; i++) {
            String name = NotebookGenerator.getName();
            var nb = new Notebook(name + " " + NotebookGenerator.getLetter());
            nb.ram = NotebookGenerator.getRam();
            nb.hd = NotebookGenerator.getHdd();
            nb.os = NotebookGenerator.getOs(name);
            nb.color = NotebookGenerator.getColor();
            nbList.add(nb);
        }
        return nbList;
    }
}
