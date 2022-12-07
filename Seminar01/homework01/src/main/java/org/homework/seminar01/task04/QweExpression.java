package org.homework.seminar01.task04;

/**
 * Задано уравнение вида q + w = e, q, w, e >= 0. Некоторые цифры могут быть заменены знаком вопроса, например 2? + ?5 = 69.
 * Требуется восстановить выражение до верного равенства. Предложить хотя бы одно решение или сообщить, что его нет.
 */
public class QweExpression {
    public static void Run() {
        var s = "2? + ?5 = 69";

        s = s.replace(" ", "").replace("+", "%").replace("=", "%");
        var ss = s.split("%");

        //String s1 = new Scanner(System.in).nextLine();
        var res = new QweExpression().Solve(ss[0], ss[1], ss[2]);
        System.out.println(res);

    }


    String Solve(String q, String w, String e) {

        var isAnswer = false;

        var qq = new NumberGenerator(q);
        var ww = new NumberGenerator(w);
        var ee = new NumberGenerator(e);

        for (var qcur : qq) {
            for (var wcur : ww) {
                for (var ecur : ee) {
                    if (qcur + wcur == wcur) {
                        isAnswer = true;
                        System.out.printf("%d + %d = %d", qcur, wcur, ecur);

                    }
                }

            }
        }
        if (!isAnswer)
            System.out.println("Нет решения");

        return q + w + e;
    }
}
