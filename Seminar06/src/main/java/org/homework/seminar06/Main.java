package org.homework.seminar06;

import java.util.ArrayList;
import java.util.List;

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

        List<Notebook> notebooks = new ArrayList<>();

        var notebookData = new NotebookData("data.txt");
        notebooks = notebookData.loadNotebooks();

        System.out.println("1 - ОЗУ");
        System.out.println("2 - Объем ЖД");
        System.out.println("3 - Операционная система");
        System.out.println("4 - Цвет");

        System.out.println(notebooks);
    }


}
