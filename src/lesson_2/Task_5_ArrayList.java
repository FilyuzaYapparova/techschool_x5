package lesson_2;

import java.util.ArrayList;
import java.util.Scanner;

public class Task_5_ArrayList {

    static Scanner scanner = new Scanner(System.in);

    public static ArrayList<Integer> readArray() {
        ArrayList<Integer> arrayList = new ArrayList<>();

        for (int i = 0; i < 3; i++) {
            if (i == 0) {
                System.out.println("Введите 1-ое число");
            } else if (i == 1) {
                System.out.println("Введите 2-ое число");
            } else if (i == 2) {
                System.out.println("Введите 3-е число");
            }
            if (scanner.hasNextInt()) {
                arrayList.add(scanner.nextInt());
            }
        }
        return arrayList;
    }

    public static int findMin(ArrayList<Integer> arrayList) {
        int min = arrayList.get(0);
        for (int i = 0; i < arrayList.size(); i++) {
            if (arrayList.get(i) < min) {
                min = arrayList.get(i);
            }
        }
        return min;
    }

    public static void main(String[] args) {
        ArrayList<Integer> array = readArray();
        System.out.println("Минимальное число = " + findMin(array));
        scanner.close();
    }
}
