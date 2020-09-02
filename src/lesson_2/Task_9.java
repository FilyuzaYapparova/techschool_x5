package lesson_2;

public class Task_9 extends BaseTask {

    int[] replace(int[] array) {
//        int buffer;
//        int j = array.length-1;
//        for (int i = 0; i < array.length/2; i++) {
//            buffer = array[i];
//            array[i] = array[j];
//            array[j] = buffer;
//            j--;
//        }
        int[] newArray = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            newArray[array.length-i-1] = array[i];
        }
        return newArray;
    }

    void printArray(int[] array){
        for (int i = 0; i < array.length; i++) {
            if (i < array.length-1) {
                System.out.print(array[i] + ", ");
            } else {
                System.out.print(array[i] + ".");
            }
        }
    }

    public static void main(String[] args) {
        new Task_9().main();
    }

    @Override
    public void run() {
        int[] array = {15, 10, 51, -6, -5, 3, -10, -34, 0, 32, 56, -12, 24, -52};
        printArray(replace(array));
    }
}