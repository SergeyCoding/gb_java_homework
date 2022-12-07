package org.homework.seminar01;

import org.homework.seminar01.task01.Task01;

import java.util.Scanner;

/*
Вычислить n-ое треугольного число(сумма чисел от 1 до n), n! (произведение чисел от 1 до n)

Вывести все простые числа от 1 до 1000

Реализовать простой калькулятор

*+Задано уравнение вида q + w = e, q, w, e >= 0. Некоторые цифры могут быть заменены знаком вопроса, например 2? + ?5 = 69.
Требуется восстановить выражение до верного равенства. Предложить хотя бы одно решение или сообщить, что его нет.
*/
public class Main {
    public static void main(String[] args) {
        System.out.println("Seminar01");
        System.out.println("1. Треугольные числа и факториал ");
        System.out.println("2. Простые числа ");
        System.out.println("3. Калькулятор ");
        System.out.println("4. Уравнение q + w = e, q, w, e >= 0 ");
        System.out.print("Выберите номер задачи: ");

        var ss=new Scanner(System.in);

        var s=ss.nextLine();

        switch (s){
            case "1":
                Task01.Run();
                break;
            case "2":
                break;
            case "3":
                break;
            case "4":
                break;
            default:
                System.out.println( "Задача не выбрана");
        }
    }
}