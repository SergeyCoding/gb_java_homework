package org.homework.seminar05.task01;

/**
 * 1. Реализуйте структуру телефонной книги с помощью HashMap, учитывая,
 * что 1 человек может иметь несколько телефонов.
 */
public class PhonebookManager {
    public static void run() {
        System.out.println("\nСеминар 5");
        System.out.println("Задача 1");

        Phonebook phonebook = new Phonebook();

        phonebook.add("a1", "+79003005081");
        phonebook.add("a2", "+79003005082");
        phonebook.add("a3", "+79003005083");
        phonebook.add("a1", "+79003005084");
        phonebook.add("a1", "+79003005085");
        phonebook.add("a5", "+79003005086");
        phonebook.add("a5", "+79003005087");

        System.out.println("Список контактов");
        System.out.println(phonebook.getNames());

        System.out.println("\nСписок телефонов контакта 'a1'");
        System.out.println(phonebook.getPhones("a1"));

        System.out.println("\nСписок телефонов контакта 'a2'");
        System.out.println(phonebook.getPhones("a2"));

        System.out.println("\nУдалили телефон у контакта 'a1'");
        phonebook.remove("a1", "+79003005081");
        System.out.println(phonebook.getPhones("a1"));

        System.out.println("\nУдалили все телефоны у контакта 'a5'. Исчез из списка контактов");
        phonebook.remove("a5", "+79003005086");
        phonebook.remove("a5", "+79003005087");
        System.out.println(phonebook.getNames());
    }
}
