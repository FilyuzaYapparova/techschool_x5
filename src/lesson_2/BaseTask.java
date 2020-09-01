package lesson_2;

import java.util.Scanner;

public class BaseTask {
    public Scanner scanner;

    public void main() {
        scanner = new Scanner(System.in);
        run();
        scanner.close();
    }

    public void run() {

    }

    public int readInt(){
        return scanner.nextInt();
    }

    public void resetScanner() {
        scanner.close();
        scanner = new Scanner(System.in);
    }

    public boolean isScannerHasNextInt(){
        return scanner.hasNextInt();
    }
}
