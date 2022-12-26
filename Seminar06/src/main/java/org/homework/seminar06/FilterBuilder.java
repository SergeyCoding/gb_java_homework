package org.homework.seminar06;

import org.homework.tools.ConsoleHelper;

import java.util.HashMap;
import java.util.Map;

public class FilterBuilder {

    private final Map<String, Integer> filterNotebook = new HashMap<>();

    public FilterBuilder() {
    }

    private void chooseRam() {
        chooseMinMax("Выберите ОЗУ от 4 Gb до 64 Gb", "ОЗУ", 4, 64);
    }

    public void chooseMinMax(String prompt, String criteria, int minValue, int maxValue) {
        System.out.println(prompt);
        var min = ConsoleHelper.getNaturalInteger(criteria + "min:", x -> x >= minValue && x <= maxValue, minValue);
        var max = ConsoleHelper.getNaturalInteger(criteria + "max:", x -> x >= min && x <= maxValue, maxValue);
//        System.out.printf("ОЗУ: %d Gb - %d Gb\n", min, max);
        filterNotebook.put(criteria + "min", min);
        filterNotebook.put(criteria + "max", max);
    }

    public Map<String, Integer> getMap() {
        return filterNotebook;
    }
}
