package lesson_2;

public class Task_2 extends BaseTask{
    public static void main(String[] args) {
        new Task_2().main();
    }

    @Override
    public void run(){
        printLine("Введите целое трехзначное число");
        if (!isScannerHasNextInt()) {
            printLine("Вы ввели не целое число");
        } else {
            int number = readInt();
            int sum = 0;
            if ((number >= 100) && (number < 1000)) {
                while (number != 0) {
                    sum += number % 10;
                    number = number / 10;
                }
                printLine("Сумма цифр вашего числа = " + sum);
            } else {
                printLine("Вы ввели не трехзначное число");
            }
        }
    }
}
