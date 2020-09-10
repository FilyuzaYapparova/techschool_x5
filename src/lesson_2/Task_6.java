package lesson_2;

import java.util.Scanner;

public class Task_6 {

    static String dividesByTwo(int a) {
        String result = "";
        if (a % 2 != 0) {
            result = "нечетное";
        } else if (a == 0) {
            result = "";
        } else if (a % 2 == 0) {
            result = "четное";
        }
        return result;
    }

    static String positiveNegativeChecking(int a) {
        String result = "";
        if (a > 0) {
            result = "положительное";
        } else if (a < 0) {
            result = "отрицательное";
        } else if (a == 0) {
            result = "нулевое";
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите целое число");
        if (scanner.hasNextInt()) {
            int a = scanner.nextInt();
            System.out.println(a + " - это " + positiveNegativeChecking(a) + " " + dividesByTwo(a) + " число");
        } else {
            System.out.println("Вы ввели не целое число");
        }
        scanner.close();
    }
}
