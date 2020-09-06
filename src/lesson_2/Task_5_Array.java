package lesson_2;

import java.util.ArrayList;

public class Task_5_Array extends BaseTask{

    public int[] readArray() {
        int[] array = new int[3];

        for (int i = 1; i <= array.length; i++) {
            if (i < 3) {
                printLine("Введите " + i + "-ое число");
            } else if (i == 3) {
                printLine("Введите " + i + "-е число");
            }
            if (isScannerHasNextInt()) {
                array[i] = readInt();
            } else {
                break; //Как отловить ошибку???? и чтобы программа норм отлавливала и не выходила с Exception
            }
        }
        return array;
    }

    public int findMin(int[] array) {
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }

    public static void main(String[] args) {
        new Task_5_ArrayList().main();
    }

    @Override
    public void run() {
        int[] array = readArray();
        printLine("Минимальное число = " + findMin(array));
    }
}
