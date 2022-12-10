package org.homework.seminar02.task01;

import java.util.Scanner;

public class SqlBuilderDispatcher {
    public static void run() {
        System.out.println("\nСеминар 2.");
        System.out.println("Задача 1.");

        var sb = new SqlBuilder("select * from students");

        var jsonStr = inputJson();

        System.out.println(jsonStr);

        var sql = sb.getSql(jsonStr);

        System.out.println(sql);
    }


    private static String inputJson() {
        StringBuilder jsonSb = new StringBuilder();

        try (var sc = new Scanner(System.in)) {
            System.out.print("Вы хотите ввести свои значения? [y/N]: ");
            var yesNo = sc.nextLine();

            if (yesNo == null || yesNo.isBlank() || yesNo.equalsIgnoreCase("N"))
                return "{\"name\":\"Ivanov\", \"country\":\"Russia\", \"city\":\"Moscow\", \"age\":\"null\"}";

            String[] paramArray = {"name", "country", "city", "age"};

            jsonSb.append("{");

            for (int i = 0; i < paramArray.length; i++) {
                if (i > 0)
                    jsonSb.append(", ");

                inputParam(paramArray[i], jsonSb, sc);
            }

            jsonSb.append("}");
        }
        return jsonSb.toString();
    }

    private static void inputParam(String paramName, StringBuilder jsonSb, Scanner sc) {
        System.out.printf("%s: ", paramName);
        var value = sc.nextLine();
        if (value == null || value.isBlank())
            jsonSb.append(String.format("\"%s\":\"null\"", paramName));
        else
            jsonSb.append(String.format("\"%s\":\"%s\"", paramName, value));
    }
}
