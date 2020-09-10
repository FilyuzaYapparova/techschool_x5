package lesson_2;

import java.util.Scanner;

public class Task_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите целое трехзначное число");
        if (!scanner.hasNextInt()) {
            System.out.println("Вы ввели не целое число");
        } else {
            int number = scanner.nextInt();
            int sum = 0;
            if ((number >= 100) && (number < 1000)) {
                while (number != 0) {
                    sum += number % 10;
                    number = number / 10;
                }
                System.out.println("Сумма цифр вашего числа = " + sum);
            } else {
                System.out.println("Вы ввели не трехзначное число");
            }
        }
        scanner.close();
    }
}
