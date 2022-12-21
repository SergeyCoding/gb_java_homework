package org.homework.seminar05.task01;

import java.util.*;

/**
 * 1. Реализуйте структуру телефонной книги с помощью HashMap, учитывая,
 * что 1 человек может иметь несколько телефонов.
 */
public class Phonebook {

    private final Map<String, List<String>> book = new HashMap<>();

    public void add(String name, String phone) {
        if (!book.containsKey(name)) {
            book.put(name, new ArrayList<>());
        }

        book.get(name).add(phone);
    }

    public void remove(String name, String phone) {
        if (!book.containsKey(name)) {
            return;
        }

        book.get(name).remove(phone);

        if (book.get(name).isEmpty()) {
            book.remove(name);
        }
    }

    public List<String> getPhones(String name) {
        for (var item : book.entrySet()) {
            if (item.getKey().equals(name)) {
                return item.getValue();
            }
        }
        return new ArrayList<>();
    }

    public List<String> getNames() {
        List<String> names = new LinkedList<>();
        for (var item : book.entrySet()) {
            names.add(item.getKey());
        }
        return names;
    }

}
