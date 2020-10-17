package lesson_5.calculator;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите тип логера: db, file, console:");
        String type = scanner.next();
        Logger logger = StaticLoggerFactory.createLogger(type);

        double a = 0;
        double b = 0;
        System.out.println("Введите число 1");
        if (scanner.hasNextDouble()) {
            a = scanner.nextDouble();
        } else {
            System.out.println("Ошибка ввода, повторите запуск программы");
        }
        System.out.println("Введите число 2");
        if (scanner.hasNextDouble()) {
            b = scanner.nextDouble();
        } else {
            System.out.println("Ошибка ввода, повторите запуск программы");
        }
        System.out.println("Выберите операцию: +, -, *, /");
        String operation = scanner.next();

        Calculator calculator = new Calculator(logger);
        switch (operation) {
            case "*":
                calculator.multiplication(a, b);
                break;
            case "/":
                calculator.division(a, b);
                break;
            case "-":
                calculator.subtraction(a, b);
                break;
            case "+":
                calculator.addition(a, b);
                break;
            default:
                System.out.println("Неизвестная операция, повторите запуск программы");
        }
    }
}
