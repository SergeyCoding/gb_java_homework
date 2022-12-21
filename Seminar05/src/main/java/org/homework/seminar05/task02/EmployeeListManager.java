package org.homework.seminar05.task02;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/**
 * 2. Пусть дан список сотрудников:
 * Написать программу, которая найдет и выведет повторяющиеся имена с количеством повторений.
 * Отсортировать по убыванию популярности.
 */
public class EmployeeListManager {
    public static void run() {
        System.out.println("\nСеминар 5");
        System.out.println("Задача 2\n");

        var p = System.getProperty("user.dir");

        Path filePath = Paths.get(p, "data.txt");
        Charset charset = StandardCharsets.UTF_8;

        try {

            List<String> strings = Files.lines(filePath, charset).toList();
            List<Person> personList = new LinkedList<>();

            for (var s : strings) {
                var zz = s.trim().split("\\s");
                personList.add(new Person(zz[0], zz[1]));
            }

            EmployeeList employeeList = new EmployeeList(personList);

            employeeList.getPopularNames().entrySet().stream()
                    .sorted(Map.Entry.<String, Integer>comparingByValue().reversed())
                    .forEach(System.out::println);

        } catch (IOException ex) {
            System.out.format("I/O error: %s%n", ex);
        }


    }
}
