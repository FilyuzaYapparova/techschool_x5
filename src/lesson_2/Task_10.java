package lesson_2;

public class Task_10 {

    static int[] replaceZero(int[] array) {
        int[] newArray = new int[array.length];
        int j = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] != 0) {
                newArray[j] = array[i];
                j++;
            }
        }
        return newArray;
    }

    static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (i < array.length - 1) {
                System.out.print(array[i] + ", ");
            } else {
                System.out.print(array[i] + ".");
            }
        }
    }

    public static void main(String[] args) {
        int[] array = {15, 10, 0, -6, -5, 3, 0, -34, 0, 32, 56, 0, 24, -52};
        printArray(replaceZero(array));
    }
}
