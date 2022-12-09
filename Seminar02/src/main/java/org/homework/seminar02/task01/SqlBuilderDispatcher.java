package org.homework.seminar02.task01;

public class SqlBuilderDispatcher {
    public static void run() {
        var sb = new SqlBuilder("select * from students");

//        String sql = sb.getSql("{\"name\":\"Ivanov\", \"country\":\"Russia\", \"city\":\"Moscow\", \"age\":\"null\"}");
//        sql = sb.getSql("{\"name\":\"null\", \"country\":\"null\", \"city\":\"null\", \"age\":\"null\"}");
        String sql = sb.getSql("{}");

        System.out.println(sql);
    }
}
