package lesson_5.calculator;

public class Calculator {

    private Logger logger;

    public Calculator(Logger logger) {
        this.logger = logger;
    }

    void multiplication(double a, double b) {
        double result = a * b;
        logger.log("результат умноженния " + a + " на " + b + " = " + result);
    }

    void division(double a, double b) {
        if (b != 0) {
            double result = a / b;
            logger.log("результат деления " + a + " на " + b + " = " + result);
        } else {
            logger.log("ошибка деления на ноль");
        }
    }

    void subtraction(double a, double b) {
        double result = a - b;
        logger.log("результат вычитания из " + a + " числа " + b + " = " + result);
    }

    void addition(double a, double b) {
        double result = a + b;
        logger.log("результат сложения " + a + " и " + b + " = " + result);
    }

}
