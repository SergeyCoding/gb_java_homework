package org.homework.seminar02;

/**
 * Дана строка sql-запроса "select * from students where ". Сформируйте часть WHERE этого запроса, используя StringBuilder. Данные для фильтрации приведены ниже в виде json строки.
 * Если значение null, то параметр не должен попадать в запрос.
 * <p>
 * Параметры для фильтрации: {"name":"Ivanov", "country":"Russia", "city":"Moscow", "age":"null"}
 * <p>
 * Реализуйте алгоритм сортировки пузырьком числового массива, результат после каждой итерации запишите в лог-файл.
 * <p>
 * Дана json строка (можно сохранить в файл и читать из файла) (Коллеги, если сложно будет распарсить .json -> можно работать как со строкой обычной)
 * <p>
 * [{"фамилия":"Иванов","оценка":"5","предмет":"Математика"},{"фамилия":"Петрова","оценка":"4","предмет":"Информатика"},{"фамилия":"Краснов","оценка":"5","предмет":"Физика"}]
 * <p>
 * Написать метод(ы), который распарсит json и, используя StringBuilder, создаст строки вида: Студент [фамилия] получил [оценка] по предмету [предмет].
 * <p>
 * Пример вывода:
 * <p>
 * Студент Иванов получил 5 по предмету Математика.
 * <p>
 * Студент Петрова получил 4 по предмету Информатика.
 * <p>
 * Студент Краснов получил 5 по предмету Физика.
 * <p>
 * 4*. К калькулятору из предыдущего дз добавить логирование.
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}
