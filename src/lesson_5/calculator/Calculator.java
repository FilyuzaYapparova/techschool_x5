package lesson_5.calculator;

public class Calculator {

    ConsoleLoggerFactory consoleLoggerFactory = new ConsoleLoggerFactory();
    FileLoggerFactory fileLoggerFactory = new FileLoggerFactory();
    DbLoggerFactory dbLoggerFactory = new DbLoggerFactory();
    Logger consoleLogger = consoleLoggerFactory.createLogger();
    Logger fileLogger = fileLoggerFactory.createLogger();
    Logger dbLogger = dbLoggerFactory.createLogger();

    void multiplication(double a, double b) {
        double result = a * b;
        consoleLogger.log("результат умноженния " + a + " на " + b + " = " + result);
        fileLogger.log("результат умноженния " + a + " на " + b + " = " + result);
        dbLogger.log("результат умноженния " + a + " на " + b + " = " + result);
    }

    void division(double a, double b) {
        if (b != 0) {
            double result = a / b;
            consoleLogger.log("результат деления " + a + " на " + b + " = " + result);
            fileLogger.log("результат деления " + a + " на " + b + " = " + result);
            dbLogger.log("результат деления " + a + " на " + b + " = " + result);
        } else {
            consoleLogger.log("ошибка деления на ноль");
            fileLogger.log("ошибка деления на ноль");
            dbLogger.log("ошибка деления на ноль");
        }
    }

    void subtraction(double a, double b) {
        double result = a - b;
        consoleLogger.log("результат вычитания из " + a + " числа " + b + " = " + result);
        fileLogger.log("результат вычитания из " + a + " числа " + b + " = " + result);
        dbLogger.log("результат вычитания из " + a + " числа " + b + " = " + result);
    }

    void addition(double a, double b) {
        double result = a + b;
        consoleLogger.log("результат сложения " + a + " и " + b + " = " + result);
        fileLogger.log("результат сложения " + a + " и " + b + " = " + result);
        dbLogger.log("результат сложения " + a + " и " + b + " = " + result);
    }

}
