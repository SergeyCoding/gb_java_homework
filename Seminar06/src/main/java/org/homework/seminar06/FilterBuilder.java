package org.homework.seminar06;

import org.homework.tools.ConsoleHelper;

import java.util.*;

public class FilterBuilder {

    private final Map<String, Object> filterNotebook = new HashMap<>();

    public FilterBuilder() {
    }

    private void chooseRam() {
        chooseMinMax("Выберите ОЗУ от 4 Gb до 64 Gb", "ОЗУ", 4, 64);
    }

    public void chooseMinMax(String prompt, String criteria, int minValue, int maxValue) {
        System.out.println(prompt);
        var min = ConsoleHelper.getNaturalInteger(criteria + "min:", x -> x >= minValue && x <= maxValue, minValue);
        var max = ConsoleHelper.getNaturalInteger(criteria + "max:", x -> x >= min && x <= maxValue, maxValue);
        filterNotebook.put(criteria + "min", min);
        filterNotebook.put(criteria + "max", max);
    }

    public void chooseValue(String prompt, String criteria, Set<String> values) {
        System.out.println(prompt);
        List<String> list = new ArrayList<>(values);
        for (int i = 0; i < list.size(); i++) {
            System.out.printf("%d - %s\n", i, list.get(i));
        }
        var answer = ConsoleHelper.getNaturalInteger("OS:", x -> x >= 0 && x <= list.size(), list.size());
        filterNotebook.put(criteria, list.get(answer));
    }

    public Map<String, Object> getMap() {
        return filterNotebook;
    }
}
