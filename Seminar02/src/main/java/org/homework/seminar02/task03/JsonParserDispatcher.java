package org.homework.seminar02.task03;

import org.json.*;


public class JsonParserDispatcher {

    public static void run() {
        System.out.println("\nСеминар 2.");
        System.out.println("Задача 3.");

        var jsonStr = "[{\"фамилия\":\"Иванов\",\"оценка\":\"5\",\"предмет\":\"Математика\"}," +
                "  {\"фамилия\":\"Петрова\",\"оценка\":\"4\",\"предмет\":\"Информатика\"}," +
                "  {\"фамилия\":\"Краснов\",\"оценка\":\"5\",\"предмет\":\"Физика\"}]";

        var jsonArray = new JSONArray(jsonStr);

        for (int i = 0; i < jsonArray.length(); i++) {
            System.out.println(jsonArray.getJSONObject(i).getString("фамилия"));
        }
    }
}
