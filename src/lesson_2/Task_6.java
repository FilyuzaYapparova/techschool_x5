package lesson_2;

public class Task_6 extends BaseTask {

    String dividesByTwo(int a) {
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

    String positiveNegativeChecking(int a) {
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
