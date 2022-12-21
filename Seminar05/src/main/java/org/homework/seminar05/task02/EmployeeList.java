package org.homework.seminar05.task02;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 2. Пусть дан список сотрудников:
 * Написать программу, которая найдет и выведет повторяющиеся имена с количеством повторений.
 * Отсортировать по убыванию популярности.
 */
public class EmployeeList {

    private final List<Person> employees;

    public EmployeeList(List<Person> employees) {
        this.employees = employees;
    }

    public Map<String, Integer> getPopularNames() {
        Map<String, Integer> countNames = new HashMap<>();

        for (var item : employees) {
            String firstName = item.getFirstName();

            if (!countNames.containsKey(firstName)) {
                countNames.put(firstName, 0);
            }

            countNames.replace(firstName, countNames.get(firstName) + 1);
        }

        return countNames;
    }
}
