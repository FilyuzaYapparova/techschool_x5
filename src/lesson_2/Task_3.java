package lesson_2;

import java.util.Scanner;

public class Task_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите целое число");

        if (!scanner.hasNextInt()) {
            System.out.println("Вы ввели не целое число");
        } else {
            int number = scanner.nextInt();
            if (number > 0) {
                number += 1;
                System.out.println("Ваше число положительное, результат задачи = " + number);
            } else if (number == 0) {
                System.out.println("Вы ввели 0");
            } else {
                System.out.println("Ваше число отрицательное, результат задачи = " + number);
            }
        }
        scanner.close();
    }
}
