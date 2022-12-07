package org.homework.seminar01;

import org.homework.seminar01.task01.Task01;
import org.homework.seminar01.task02.PrimeNumbers;
import org.homework.seminar01.task03.SimpleCalc;
import org.homework.seminar01.task04.QweExpression;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        System.out.println("Seminar01");
        System.out.println("1. Треугольные числа и факториал ");
        System.out.println("2. Простые числа ");
        System.out.println("3. Калькулятор ");
        System.out.println("4. Уравнение q + w = e, q, w, e >= 0 ");
        System.out.print("Выберите номер задачи: ");

        var ss = new Scanner(System.in);

        var s = ss.nextLine();

        switch (s) {
            case "1":
                Task01.Run();
                break;
            case "2":
                PrimeNumbers.Run();
                break;
            case "3":
                SimpleCalc.Run();
                break;
            case "4":
                QweExpression.Run();
                break;
            default:
                System.out.println("Задача не выбрана");
        }
    }
}