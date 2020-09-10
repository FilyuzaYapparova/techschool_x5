package lesson_2;

public class Task_8 {

    static void allChecking(int[] array) {
        int maxElement = array[0];
        int positiveElementsSum = 0;
        int negativeElementsSum = 0;
        int negativeEvenElementsSum = 0;
        int positiveElementsCount = 0;
        int negativeElementsCount = 0;
        double negativeElementsAverage = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > maxElement) {
                maxElement = array[i];
            }
            if (array[i] > 0) {
                positiveElementsSum += array[i];
                positiveElementsCount++;
            }
            if (array[i] < 0) {
                negativeElementsSum += array[i];
                negativeElementsCount++;
                if (array[i] % 2 == 0) {
                    negativeEvenElementsSum += array[i];
                }
            }
        }
        System.out.println("Максимальное значение = " + maxElement);
        System.out.println("Сумма положительных элементов = " + positiveElementsSum);
        System.out.println("Сумма отрицательных четных элементов = " + negativeEvenElementsSum);
        System.out.println("Количество положительных элементов = " + positiveElementsCount);
        if (negativeElementsCount > 0) {
            negativeElementsAverage = (double) negativeElementsSum / negativeElementsCount;
        }
        System.out.println("Среднее арифметическое отрицательных элементов = " + negativeElementsAverage);
    }

    static void max(int[] array) {
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        System.out.println("Максимальное значение = " + max);
    }

    static void positiveSum(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0) {
                sum += array[i];
            }
        }
        System.out.println("Сумма положительных элементов = " + sum);
    }

    static void negativeSum(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            if ((array[i] < 0) && (array[i] % 2 == 0)) {
                sum += array[i];
            }
        }
        System.out.println("Сумма отрицательных четных элементов = " + sum);
    }

    static void positiveCount(int[] array) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0) {
                count++;
            }
        }
        System.out.println("Количество положительных элементов = " + count);
    }

    static void negativeMidSum(int[] array) {
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
        System.out.println("Среднее арифметическое отрицательных элементов = " + result);
    }

    public static void main(String[] args) {
        int[] array = {1, -10, 5, 6, 45, 23, -45, -34, 0, 32, 56, -1, 2, -2};
        max(array);
        positiveSum(array);
        negativeSum(array);
        positiveCount(array);
        negativeMidSum(array);
        allChecking(array);
    }
}
