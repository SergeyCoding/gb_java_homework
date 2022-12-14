package org.homework.seminar02.task03;

import org.json.*;

/**
 * Дана json строка (можно сохранить в файл и читать из файла)
 * (Коллеги, если сложно будет распарсить .json -> можно работать как со строкой обычной)
 * <p>
 * [{"фамилия":"Иванов","оценка":"5","предмет":"Математика"},
 * {"фамилия":"Петрова","оценка":"4","предмет":"Информатика"},
 * {"фамилия":"Краснов","оценка":"5","предмет":"Физика"}]
 * <p>
 * Написать метод(ы), который распарсит json и, используя StringBuilder,
 * создаст строки вида: Студент [фамилия] получил [оценка] по предмету [предмет].
 * <p>
 * Пример вывода:
 * Студент Иванов получил 5 по предмету Математика.
 * Студент Петрова получил 4 по предмету Информатика.
 * Студент Краснов получил 5 по предмету Физика.
 */
public class JsonParser {

    public static void run() {
        System.out.println("\nСеминар 2.");
        System.out.println("Задача 3.");

        var jsonStr = "[{\"фамилия\":\"Иванов\",\"оценка\":\"5\",\"предмет\":\"Математика\"}," +
                "  {\"фамилия\":\"Петрова\",\"оценка\":\"4\",\"предмет\":\"Информатика\"}," +
                "  {\"фамилия\":\"Краснов\",\"оценка\":\"5\",\"предмет\":\"Физика\"}]";


        var jsonArray = new JSONArray(jsonStr);

        for (int i = 0; i < jsonArray.length(); i++) {
            JSONObject jsonObject = jsonArray.getJSONObject(i);

            var rowStr = String.format("Студент %s получил %s по предмету %s.",
                    jsonObject.getString("фамилия"),
                    jsonObject.getString("оценка"),
                    jsonObject.getString("предмет")
            );

            System.out.println(rowStr);
        }
    }
}
