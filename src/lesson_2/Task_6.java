package lesson_2;

import static lesson_2.TaskUtil.*;

public class Task_6 extends BaseTask {

    String dividesByTwo(int a) {
        String line_2 = "";
        if (a % 2 != 0) {
            line_2 = "нечетное";
        } else if (a == 0) {
            line_2 = "";
        } else if (a % 2 == 0) {
            line_2 = "четное";
        }
        return line_2;
    }

    String positiveNegativeChecking(int a) {
        String line_1 = "";
        if (a > 0) {
            line_1 = "положительное";
        } else if (a < 0) {
            line_1 = "отрицательное";
        } else if (a == 0) {
            line_1 = "нулевое";
        }
        return line_1;
    }

    public static void main(String[] args) {
        new Task_6().main();
    }

    @Override
    public void run() {
        printLine("Введите целое число");
        if (isScannerHasNextInt()) {
            int a = readInt();
            printLine(a + " - это " + positiveNegativeChecking(a) + " " + dividesByTwo(a) + " число");
        } else {
            printLine("Вы ввели не целое число");
        }
    }
}
