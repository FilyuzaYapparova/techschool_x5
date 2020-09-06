package lesson_2;

public class Task_8 extends BaseTask {

    void allChecking(int[] array) {
        int max = array[0];
        int sum1 = 0;
        int sum2 = 0;
        int sum3 = 0;
        int count1 = 0;
        int count2 = 0;
        double result = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
            if (array[i] > 0) {
                sum1 += array[i];
                count1++;
            }
            if (array[i] < 0) {
                sum2 += array[i];
                count2++;
                if (array[i] % 2 == 0) {
                    sum3 += array[i];
                }
            }
        }
        printLine("Максимальное значение = " + max);
        printLine("Сумма положительных элементов = " + sum1);
        printLine("Сумма отрицательных четных элементов = " + sum3);
        printLine("Количество положительных элементов = " + count1);
        if (count2 > 0) {
            result = (double) sum2 / count2;
        }
        printLine("Среднее арифметическое отрицательных элементов = " + result);
    }

    void max(int[] array) {
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        printLine("Максимальное значение = " + max);
    }

    void positiveSum(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0) {
                sum += array[i];
            }
        }
        printLine("Сумма положительных элементов = " + sum);
    }

    void negativeSum(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            if ((array[i] < 0) && (array[i] % 2 == 0)) {
                sum += array[i];
            }
        }
        printLine("Сумма отрицательных четных элементов = " + sum);
    }

    void positiveCount(int[] array) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0) {
                count++;
            }
        }
        printLine("Количество положительных элементов = " + count);
    }

    void negativeMidSum(int[] array) {
        int sum = 0;
        int count = 0;
        double result = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0) {
                sum += array[i];
                count++;
            }
        }
        if (count > 0) {
            result = (double) sum / count;
        }
        printLine("Среднее арифметическое отрицательных элементов = " + result);
    }

    public static void main(String[] args) {
        new Task_8().main();
    }

    @Override
    public void run() {
        int[] array = {1, -10, 5, 6, 45, 23, -45, -34, 0, 32, 56, -1, 2, -2};
        max(array);
        positiveSum(array);
        negativeSum(array);
        positiveCount(array);
        negativeMidSum(array);
        allChecking(array);
    }
}
