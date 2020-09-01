package lesson_2;

import static lesson_2.TaskUtil.*;

import java.util.ArrayList;

public class Task_5 extends BaseTask{

    public ArrayList<Integer> readArray() {
        ArrayList<Integer> arrayList = new ArrayList<>();

        for (int i = 1; i <= 3; i++) {
            if (i < 3) {
                printLine("Введите " + i + "-ое число");
            } else if (i == 3) {
                printLine("Введите " + i + "-е число");
            }
            if (isScannerHasNextInt()) {
                arrayList.add(readInt());
            } else {
                break; //Как отловить ошибку???? и чтобы программа норм отлавливала и не выходила с Exception
            }
        }
        return arrayList;
    }

    public int findMin(ArrayList<Integer> arrayList) {
        int min = arrayList.get(0);
        for (int i = 0; i < arrayList.size(); i++) {
            if (arrayList.get(i) < min) {
                min = arrayList.get(i);
            }
        }
        return min;
    }

    public static void main(String[] args) {
        new Task_5().main();
    }

    @Override
    public void run() {
        ArrayList<Integer> array = readArray();
        if (array.size() != 3) {
            printLine("Ошибка, в списке не 3 числа, повторите запуск программы.");
            return;
        }
        printLine("Минимальное число = " + findMin(array));
    }
}
