package lesson_2;

import java.util.Scanner;

public class Task_7 {
    static void printMessage(String city, double cost) {
        System.out.println(city + ". Стоимость разговора: " + (cost * 10));
    }


    static void city(int code) {
        String city;
        double cost;
        switch (code) {
            case 905:
                city = "Москва";
                cost = 4.15;
                break;
            case 194:
                city = "Ростов";
                cost = 1.98;
                break;
            case 491:
                city = "Краснодар";
                cost = 2.69;
                break;
            case 800:
                city = "Киров";
                cost = 5.00;
                break;
            default:
                city = "Неизвестно";
                cost = 0.00;
                break;
        }
        printMessage(city, cost);
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите код города");
        if (scanner.hasNextInt()) {
            int cityCode = scanner.nextInt();
            city(cityCode);
        } else {
            System.out.println("Вы ввели не целое число");
        }
        scanner.close();
    }
}
