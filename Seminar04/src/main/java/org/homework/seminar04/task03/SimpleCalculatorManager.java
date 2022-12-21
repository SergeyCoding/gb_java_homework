package org.homework.seminar04.task03;

import org.homework.tools.ConsoleHelper;

import java.io.IOException;
import java.util.function.Predicate;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

/**
 * 3. В калькулятор добавьте возможность отменить последнюю операцию.
 */
public class SimpleCalculatorManager {

    public static void run() {
        System.out.println("\nСеминар 4.");
        System.out.println("Задача 3.");

        var logFilename = "calc_log.txt";
        Logger logger = getLogger(logFilename);

        System.out.println("Вводите либо число, либо операцию (+, -, *, /)");
        System.out.println("c - для отмены операции");
        System.out.println("cc - сброс (после него отмена невозможна)");
        System.out.println("exit - выход\n");

        var calc = new SimpleCalculator();

        while (true) {
            var s = ConsoleHelper.getString("> ", new CalcOperationPredicate());

            if (s.equals("exit"))
                break;

            System.out.println(calc.pushAction(s));
        }

    }


    private static class CalcOperationPredicate implements Predicate<String> {
        @Override
        public boolean test(String s) {
            if (SimpleCalculator.isOperation(s) || s.equalsIgnoreCase("exit")) {
                return true;
            }

            try {
                Double.parseDouble(s);
                return true;
            } catch (NumberFormatException e) {
                return false;
            }
        }
    }

    private static Logger getLogger(String logFilename) {

        var logger = Logger.getLogger(SimpleCalculator.class.getName());
        try {
            FileHandler fh = new FileHandler(logFilename);
            fh.setFormatter(new SimpleFormatter());
            logger.addHandler(fh);
            logger.setUseParentHandlers(false);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return logger;
    }
}
