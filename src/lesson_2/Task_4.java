package lesson_2;

public class Task_4 extends BaseTask{
    public static void main(String[] args) {
        new Task_4().main();
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
                printLine("Вы ввели 0, результат задачи = " + 10);
            } else if (number < 0) {
                number -= 2;
                printLine("Ваше число отрицательное, результат задачи = " + number);
            }
        }
    }
}
