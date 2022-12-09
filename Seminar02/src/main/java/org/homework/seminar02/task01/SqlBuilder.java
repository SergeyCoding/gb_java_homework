package org.homework.seminar02.task01;

import java.util.Objects;

/**
 * Дана строка sql-запроса "select * from students where ".
 * Сформируйте часть WHERE этого запроса, используя StringBuilder.
 * Данные для фильтрации приведены ниже в виде json строки.
 * Если значение null, то параметр не должен попадать в запрос.
 * Параметры для фильтрации: {"name":"Ivanov", "country":"Russia", "city":"Moscow", "age":"null"}
 */
public class SqlBuilder {

    private final String sql;

    public SqlBuilder(String sql) {

        this.sql = sql.replace("where", "").strip();
    }

    public String getSql(String jsonStr) {
        String whereStr = getWhere(jsonStr);

        if (Objects.equals(whereStr, ""))
            return sql;

        return sql + " where " + whereStr;
    }

    public String getWhere(String jsonFilter) {
        var sb = new StringBuilder();

        var filter = jsonFilter
                .replace(" ", "")
                .replace("{", "")
                .replace("}", "");

        String[] params = filter.split(",");

        for (var p : params) {
            String[] kv = p.split(":");
            if (kv[1].equals("\"null\""))
                continue;

            if (!sb.isEmpty())
                sb.append(" and ");

            sb.append(kv[0].replace("\"", ""))
                    .append(" = ")
                    .append(kv[1].replace("\"", ""));
        }

        return sb.toString();
    }
}
