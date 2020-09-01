package lesson_2;

import static lesson_2.TaskUtil.*;

public class Task_3 extends BaseTask{
    public static void main(String[] args) {
        new Task_3().main();
    }

    @Override
    public void run() {
        printLine("Введите целое число");

        if (!isScannerHasNextInt()) {
            printLine("Вы ввели не целое число");
        } else {
            int number = readInt();
            if (number > 0) {
                number += 1;
                printLine("Ваше число положительное, результат задачи = " + number);
            } else if (number == 0) {
                printLine("Вы ввели 0");
            } else {
                printLine("Ваше число отрицательное, результат задачи = " + number);
            }
        }
    }
}
