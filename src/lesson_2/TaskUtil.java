package lesson_2;

import java.util.Scanner;

public class TaskUtil {
    static Scanner scanner = new Scanner(System.in);

    public static int readInt() {
        int number = scanner.nextInt();
        return number;
    }

    public static void printLine(String line) {
        System.out.println(line);
    }

    public static boolean isScannerHasNextInt() {
        return scanner.hasNextInt();
    }

}
