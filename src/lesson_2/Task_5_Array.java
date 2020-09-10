package lesson_2;

import java.util.Scanner;

public class Task_5_Array {
    static Scanner scanner = new Scanner(System.in);
    public static int[] readArray() {

        int[] array = new int[3];

        for (int i = 0; i < array.length; i++) {
            if (i == 0) {
                System.out.println("Введите 1-ое число");
            } else if (i == 1) {
                System.out.println("Введите 2-ое число");
            } else if (i == 2) {
                System.out.println("Введите 3-е число");
            }
            if (scanner.hasNextInt()) {
                array[i] = scanner.nextInt();
            }
        }
        return array;
    }

    public static int findMin(int[] array) {
        int min = array[0];
        for (int j : array) {
            if (j < min) {
                min = j;
            }
        }
        return min;
    }

    public static void main(String[] args) {
        int[] array = readArray();
        System.out.println("Минимальное число = " + findMin(array));
        scanner.close();
    }
}
