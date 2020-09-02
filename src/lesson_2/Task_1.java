package lesson_2;

public class Task_1 extends BaseTask {

    public int modInt(int number) {
        int numeral = number % 10;
        return Math.abs(numeral);
    }

    public static void main(String[] args) {
        new Task_1().main();
    }

    @Override
    public void run() {
        printLine("Введите целое число");

        if (isScannerHasNextInt()) {
            int number = readInt();
            printLine("Последняя цифра вашего числа = " + modInt(number));
        } else {
            printLine("Вы ввели не целое число");
        }
    }
}
