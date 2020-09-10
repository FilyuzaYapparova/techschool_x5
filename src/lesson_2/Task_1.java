package lesson_2;

import java.util.Scanner;

public class Task_1 {

    public static int modInt(int number) {
        int numeral = number % 10;
        return Math.abs(numeral);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите целое число");

        if (scanner.hasNextInt()) {
            int number = scanner.nextInt();
            System.out.println("Последняя цифра вашего числа = " + modInt(number));
        } else {
            System.out.println("Вы ввели не целое число");
        }
        scanner.close();
    }
}
