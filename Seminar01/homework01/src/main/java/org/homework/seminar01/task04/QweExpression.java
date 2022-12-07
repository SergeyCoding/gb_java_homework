package org.homework.seminar01.task04;

import java.util.Objects;
import java.util.Scanner;

/**
 * Задано уравнение вида q + w = e, q, w, e >= 0. Некоторые цифры могут быть заменены знаком вопроса, например 2? + ?5 = 69.
 * Требуется восстановить выражение до верного равенства. Предложить хотя бы одно решение или сообщить, что его нет.
 */
public class QweExpression {
    public static void Run() {
        System.out.println("\nTask04");

        var s = "2? + ?5 = 69";

        System.out.print("Введите выражение: ");
        var s_inp = new Scanner(System.in).nextLine();

        if (!Objects.equals(s_inp, ""))
            s = s_inp;

        System.out.println("Задача: " + s);

        s = s.replace(" ", "").replace("+", "%").replace("=", "%");
        var ss = s.split("%");

        //String s1 = new Scanner(System.in).nextLine();
        var res = new QweExpression().Solve(ss[0], ss[1], ss[2]);
        System.out.println(res);

    }


    String Solve(String q, String w, String e) {

        var qq = new NumberGenerator(q);
        var ww = new NumberGenerator(w);
        var ee = new NumberGenerator(e);

        for (var qcur : qq) {
            for (var wcur : ww) {
                for (var ecur : ee) {
                    if (qcur + wcur == ecur) {
                        return String.format("%d + %d = %d\n", qcur, wcur, ecur);
                    }
                }

            }
        }

        return "Нет решения";
    }
}
